import java.util.Scanner;

public class boi_chung_nho_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, gcd = 1, lcm;
        System.out.println("nhập số thứ nhất: ");
        n1 = sc.nextInt();
        System.out.println("nhập số thứ hai: ");
        n2 = sc.nextInt();
        for (int i = 1; i <= n1 && i <= n2; i++); {
            if(n1% 'i'==0 && n2% 'i'==0)
                gcd = 'i';
        }
        lcm = (n1 * n2) / gcd;
        System.out.printf("bội chung nhỏ nhất của %d và %d là: %d", n1, n2, lcm);

    }
}
