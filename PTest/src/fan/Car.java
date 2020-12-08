package fan;

public class Car {
	String name;
	double tank;
	double oilConsumption;
	public Car() {
		
	}
	
	public String toString() {
		return "Car [name=" + name + ", tank=" + tank + ", oilCousumption =" + oilConsumption + "]";
	}
	
	public Car(String name, double tank, double oilConsumption) {
		this.name = name;
		this.tank = tank;
		this.oilConsumption = oilConsumption;
	}
	public void gas(double gas1) {
		tank = tank +gas1;
	}
	public boolean run() {
		if (tank>0) {
			return true;
		}
		return false;
	}

}
