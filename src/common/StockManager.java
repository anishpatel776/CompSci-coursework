package common;
import java.util.HashMap;

public abstract class StockManager {

	//Member variables
	protected static HashMap<Model, Integer> _restock_amount = new HashMap<Model, Integer>();
	protected static HashMap<Model, Integer> _restock_threshold = new HashMap<Model,Integer>();
	protected static HashMap<Model, Integer> _current_stock = new HashMap<Model, Integer>();
	public static HashMap<Model, Integer> _stock = new HashMap<Model, Integer>();
	
	//Accessors
	public int get_restock_amount(Model model) {
		
		return _restock_amount.get(model);
	}
	public int get_restock_threshold(Model model) {
		
		return _restock_threshold.get(model);
	}
	public int get_current_stock(Model model) {
		
		return _current_stock.get(model);
	}
	
	//Mutators
	public static void set_restock_amount(Model model, int amount) {
		
		_restock_amount.put(model, amount);
	}
	public static void set_restock_threshold(Model model, int threshold) {
		
		_restock_threshold.put(model, threshold);
	}
	
}