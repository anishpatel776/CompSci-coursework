package common;

import java.util.HashMap;

public class IngredientManager extends StockManager{
	
	protected static HashMap<Ingredient, Integer> _current_stock = new HashMap<Ingredient, Integer>();
	

	public static void set_current_stock(Ingredient ingredient, int value) {
		
		_current_stock.put(ingredient, value);
	}
	
	public static int get_current_stock(Ingredient ingredient) {
		
		return _current_stock.get(ingredient);
	}
}