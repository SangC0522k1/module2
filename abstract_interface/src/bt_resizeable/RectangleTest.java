package bt_resizeable;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(3.5, 5.2);
        System.out.println(rectangle);

        rectangle = new Rectangle(3.5, 4.6, "red", true);
        System.out.println(rectangle);

        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1.getArea());
        rectangle1.resizeable(10);
        System.out.println(rectangle1.getArea());
    }

}
