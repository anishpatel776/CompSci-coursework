package common;

import java.util.HashMap;

public class DishManager extends StockManager{

	protected static HashMap<Dish, Integer> _current_stock = new HashMap<Dish, Integer>();
	
	public static void set_current_stock(Dish dish, int amount) {
		
		_current_stock.put(dish, amount);
	}
	public static int get_current_stock(Dish dish) {
		
		return _current_stock.get(dish);
	}
}