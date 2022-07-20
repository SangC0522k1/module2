package th_static_property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("zamaha", "4 thì");
        System.out.println(Car.number0fCars);
        Car car2 = new Car("Honda", "3 thì");
        System.out.println(Car.number0fCars);
    }
}
