package BT_QuadraticEquation;

public class Main {
    public static void main(String[] args) {
        System.out.print("Nhập hệ số bậc 2, a = ");
        float a = QuadraticEquation.scanner.nextInt();
        System.out.print("Nhập hệ số bậc 1, b = ");
        float b = QuadraticEquation.scanner.nextFloat();
        System.out.print("Nhập hằng số tự do, c = ");
        float c = QuadraticEquation.scanner.nextFloat();
        QuadraticEquation.giaiBac2(a, b, c);
    }
}
