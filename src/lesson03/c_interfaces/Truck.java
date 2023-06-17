package lesson03.c_interfaces;

public class Truck extends Car implements Climatable{

    public Truck(String manufacturer, int produceYear, String color) {
        super(manufacturer, produceYear, color);
    }

    public Truck(String manufacturer, int produceYear, String color, Engine engine) {
        super(manufacturer, produceYear, color, engine);
    }

    @Override
    protected String getName() {
        return "Truck";
    }
}
