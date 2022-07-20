package th_static_property;

public class Car {
    private String name;
    private String engine;

    public static int number0fCars;
    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        number0fCars++;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
