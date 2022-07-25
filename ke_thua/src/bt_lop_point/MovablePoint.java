package bt_lop_point;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
    }
    public MovablePoint(float xSpeed, float ySpeed) {
    }
    public MovablePoint() {
    }

    public float getxSpeed(float xSpeed) {
        return this.xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed(float ySpeed) {
        return this.ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed) {
        this.getxSpeed(xSpeed);
        this.getySpeed(ySpeed);
    }
    public float[] getSpeed() {
        return new float[] {getxSpeed(xSpeed), getySpeed(ySpeed)};
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public MovablePoint move() {
        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + ySpeed);
        return this;
    }
}
