package bt_lop;

// File Main.java
public class Main {

    public static void main(String[] args) {
        Circle cylinder = new Cylinder(2.5, "red", 15);
        System.out.println("Area: " + cylinder.getArea());
        System.out.println("Volume: " + ((Cylinder) cylinder).getVolumer());
    }
}
