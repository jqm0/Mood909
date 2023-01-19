package ThursdayTask1;

public class Vehicle {
	public String make;
	public String model;
	public String color;
	public Integer year;
	public Integer numberOfWheels;
	public Integer weight;

	public void start() {
		System.out.println("Vehicle started");
	}

	public void stop() {
		System.out.println("Vehicle stopped.");
	}

	public void drive(int numberOfMilesDriven) {
		System.out.println("Vehicle driven " + numberOfMilesDriven+ " miles.");
	}

	public void honk() {
		System.out.println("Honk Honk!");
	}
	
}
