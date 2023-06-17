package lesson03.a_inheritance;

public class PassengerCar extends Car {

    public PassengerCar(String manufacturer, int produceYear, String color) {
        super(manufacturer, produceYear, color);
    }

    @Override
    protected String getName() {
        return "Passenger car";
    }
}
