package ThursdayTask2;

public class Vehicle extends Engine implements Honkable {
	private String make;
	private String model;
	private String color;
	private Integer year;
	private Integer numberOfWheels;
	private Integer weight;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(Integer numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

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

	@Override
	public void startEngine() {
		System.out.println("implement abstract method");
		
	}
	
}
