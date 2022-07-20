package bt_access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle(){
    }
    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public double getArea() {
        return Math.pow(radius,2)* 3.14;
    }

}
