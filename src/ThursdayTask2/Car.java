package ThursdayTask2;


public class Car extends Vehicle {
	public int numberOfDoors;

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public void openTrunk() {
		System.out.println("Trunk opened.");
	}
}
