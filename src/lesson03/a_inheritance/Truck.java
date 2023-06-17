package lesson03.a_inheritance;

public class Truck extends Car {

    public Truck(String manufacturer, int produceYear, String color) {
        super(manufacturer, produceYear, color);
    }

    @Override
    protected String getName() {
        return "Truck";
    }
}
