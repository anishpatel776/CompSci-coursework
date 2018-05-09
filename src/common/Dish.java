package common;
import java.util.HashMap;

public class Dish extends Model{

	//Member variables
	private String _desc;
	private float _price;//Float instead of double because no more than 2d.p

	/**Due to use iterator here(and change to private):**/
	public HashMap<Ingredient, Integer> _recipe = new HashMap<Ingredient, Integer>();
	
	//Accessors
	public String getName() {
		
		return this.name;
	}
	public String get_desc() {
		
		return this._desc;
	}
	public float get_price() {
		
		return this._price;
	}
	public int getIngredientAmount(Ingredient ingredient) {
		
		return this._recipe.get(ingredient);
	}
	
	//Mutators
	public void setIngredientAmount(Ingredient ingredient, Integer amount) {
		
		this._recipe.put(ingredient, amount);
	}
	public void set_desc(String desc) {
		
		notifyUpdate("desc", this._desc, desc);
		this._desc = desc;
		return;
	}
	public void set_price(float price) {
		
		notifyUpdate("price", this._price, price);
		this._price = price;
		return;
	}
}