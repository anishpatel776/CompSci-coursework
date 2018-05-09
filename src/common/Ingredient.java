package common;

public class Ingredient extends Model{

	//Member variables
	private String _unit;
	public Supplier _supplier;
	
	//Accessors
	public String getName() {
		
		return this.name;
	}
	public String get_unit() {
		
		return this._unit;
	}
	
	public Supplier get_supplier() {
	
	return this._supplier;
	}
	
	
	//Mutators
	public void set_unit(String unit) {
		
		notifyUpdate("unit", this._unit, unit);
		this._unit = unit;
		return;
	}
	public void set_supplier(Supplier supplier) {
	
		notifyUpdate("supplier", this._supplier, supplier);
		this._supplier = supplier;
		return;
	}
}
