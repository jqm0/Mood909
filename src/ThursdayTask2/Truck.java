package ThursdayTask2;

public class Truck extends Vehicle{
	public Integer numberOfAxles ;
	public Integer capacityInTons;
	public void load(int weight) {
		System.out.println("Loaded " + weight + " tons.");
	}
	public Integer getNumberOfAxles() {
		return numberOfAxles;
	}
	public void setNumberOfAxles(Integer numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}
	public Integer getCapacityInTons() {
		return capacityInTons;
	}
	public void setCapacityInTons(Integer capacityInTons) {
		this.capacityInTons = capacityInTons;
	}
}

