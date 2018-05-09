package common;
import java.util.Random;

public class Staff extends Model implements Runnable{
	
	private DishManager _dish_manager = new DishManager();
	private IngredientManager _ingredient_manager = new IngredientManager();
	private String _status = "Idle";
	
	public void run() {
		
		synchronized(_dish_manager) {
			synchronized(_ingredient_manager) {
				
				for(Dish dish : _dish_manager._current_stock.keySet()) {
					
					boolean _low_stock = _dish_manager.get_current_stock(dish) <= _dish_manager.get_restock_threshold(dish);
					
					if(_low_stock) {
						
						try {
							
							this._status = "Restocking";
							Random _random = new Random();
							int time = _random.nextInt(4) + 1;
							Thread.sleep(time*1000);
						}
						catch(Exception e){
							
							this._status = "Finished restocking";
						}
						restockDish(dish, _ingredient_manager);
					}
				}
			}
		}
	}
	
	public String getName() {

		return this.name;
	}
	
	public void restockDish(Dish dish, IngredientManager _ingredient_manager) {
		
		for(Ingredient ingredient : dish._recipe.keySet()) {
			
			int current_stock = IngredientManager.get_current_stock(ingredient);
			IngredientManager._current_stock.put(ingredient, current_stock - dish.getIngredientAmount(ingredient));
		}
		this._status = "Idle";
	}
}