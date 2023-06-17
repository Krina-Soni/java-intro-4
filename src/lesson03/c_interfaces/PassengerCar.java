package lesson03.c_interfaces;

import lesson02.Person;

public class PassengerCar extends Car implements Climatable{

    // Composition - aggregation
    private Person[] persons;

    public PassengerCar(String manufacturer, int produceYear, String color) {
        super(manufacturer, produceYear, color);
    }

    public PassengerCar(String manufacturer, int produceYear, String color, Engine engine) {
        super(manufacturer, produceYear, color, engine);
    }

    @Override
    public void climateControl(int temp) {
        System.out.println("Climate control tries to make temp: " + temp);
    }

    @Override
    protected String getName() {
        return "Passenger car";
    }
}
