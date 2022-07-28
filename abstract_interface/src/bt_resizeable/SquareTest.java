package bt_resizeable;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);

        Square square1 = new Square();
        square1.setSide(10);
        System.out.println(square1.getSide());
        square1.resizeable(10);
        System.out.println(square1.getSide());
    }
}
