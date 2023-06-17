package lesson03.b_composition;

import lesson02.Person;

public class PassengerCar extends Car {

    // Composition - aggregation
    private Person[] persons;

    public PassengerCar(String manufacturer, int produceYear, String color) {
        super(manufacturer, produceYear, color);
    }

    public PassengerCar(String manufacturer, int produceYear, String color, Engine engine) {
        super(manufacturer, produceYear, color, engine);
    }

    @Override
    protected String getName() {
        return "Passenger car";
    }
}
