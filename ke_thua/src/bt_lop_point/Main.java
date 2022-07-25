package bt_lop_point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        point.setY(5.6f);
        point.setX(2.4f);
        System.out.println(point.toString());
        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setxSpeed(3.5f);
        movablePoint.setySpeed(4.5f);
        System.out.println(movablePoint.toString());
    }
}
