package ThursdayTask1;

public class TesterforTask1 {

	public static void main(String[] args) {
		Vehicle V1 = new Vehicle();
		V1.numberOfWheels = 4;
		V1.drive(100);
		Truck TruckA = new Truck();
		TruckA.numberOfAxles = 4;
		TruckA.color = "red" ;
		System.out.println("The Truck color is : "+ TruckA.color + " With Axles : "+TruckA.numberOfAxles );
		Car superCar = new Car();
		superCar.numberOfDoors = 2 ;
		System.out.println("This Car has "+ superCar.numberOfDoors + " Doors");
	}

}
