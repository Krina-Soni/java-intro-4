package lesson03.a_inheritance;

public class Programm {

	public static void main(String[] args) {
		Truck truck = new Truck("Renault", 2001, "White");
		PassengerCar passengerCar = new PassengerCar("Daewoo", 2005, "Silver");

		System.out.println(truck);
		System.out.println(passengerCar);

		truck.gas();
		passengerCar.gas();
		passengerCar.stop();
		truck.stop();
	}
}
