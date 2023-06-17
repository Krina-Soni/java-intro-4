package lesson03.a_inheritance;

public abstract class Car {

    private String manufacturer;
    private int produceYear;
    private String color;


    public Car(String manufacturer, int produceYear, String color) {
        this.manufacturer = manufacturer;
        this.produceYear = produceYear;
        this.color = color;
    }

    protected abstract String getName();

    public void gas() {
        System.out.println(getName() + " started to move");
    }

    public void stop() {
        System.out.println(getName() + " started to stop");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + getName() + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", produceYear=" + produceYear +
                ", color='" + color + '\'' +
                '}';
    }
}