package common;

public class Supplier extends Model{

	//Member variables
	private double _distance;
	
	//Accessors
	public String getName() {
		
		return this.name;
	}
	public double get_distance() {
		
		return this._distance;
	}
	
	//Mutators
	public void set_distance(double distance) {
		
		notifyUpdate("distance", this._distance, distance);
		this._distance = distance;
		return;
	}
}