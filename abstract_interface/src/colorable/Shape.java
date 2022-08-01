package colorable;

public class Shape {
    private String color = "red";
    protected boolean filled = true;

    public Shape(double v) {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }


    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}