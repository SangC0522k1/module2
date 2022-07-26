package th_2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
      ComparableCircle[] circles = new ComparableCircle[3];
      circles[0] = new ComparableCircle(4.6);
      circles[1] = new ComparableCircle();
      circles[2] = new ComparableCircle(3.5,"indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
