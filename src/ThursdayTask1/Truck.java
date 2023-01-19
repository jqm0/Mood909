package ThursdayTask1;

public class Truck extends Vehicle{
	public Integer numberOfAxles ;
	public Integer capacityInTons;
	public void load(int weight) {
		System.out.println("Loaded " + weight + " tons.");
	}
}
