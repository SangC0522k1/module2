import java.util.Scanner;

public class Bac_1 {
    public static void main(String[] args) {
        System.out.println("bộ phân giải phương trình tuyến");
        System.out.println("Biểu thức sau 'a * x + b = c',vui lòng nhập hằng số:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) /a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        }else {
            if (b == c) {
                System.out.print("Giải pháp là tất cả x");
            }else {
                System.out.print("k có giải pháp");
            }
        }
    }
}
