package part213;

public class Vehicle {
	String Name, Type;
	int maxSpeed;
	String getName(){
		return Name;
	}
	void setName(String Name){
		this.Name = Name;
	}
	String getType(){
		return Type;
	}
	void setType(String Type){
		this.Type = Type;
	}
	int getmaxSpeed(){
		return maxSpeed;
	}
	void setmaxSpeed(int maxSpeed){
		this.maxSpeed = maxSpeed;
	}
	
	public static void main(String[] args){
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle();
		
		v1.setName("自行车");
		v1.setType("非机动车");
		v1.setmaxSpeed(40);
	
		v2.setName("汽车");
		v2.setType("机动车");
		v2.setmaxSpeed(180);
		
		System.out.println("The vehicle information:");
		System.out.println(v1.getName() + "\t" + v1.getType() + "\t" + v1.getmaxSpeed());
		System.out.println(v2.getName() + "\t" + v2.getType() + "\t" + v2.getmaxSpeed());
	}
}
