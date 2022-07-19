import java.util.Scanner;

public class Chuc_nang_Menu {
    public static void main(String[] args) {
        Menu();
        int sc = -1;
        Scanner input = new Scanner(System.in);
        while (sc != 0) {
            System.out.println("Nhập chức năng: ");
            sc = input.nextInt();
            switch (sc) {
                case 1:
                    System.out.println("* * * * * Quản lý người dùng * * * * ");
                    System.out.println("*            1. Tên                *");
                    System.out.println("*            2. Tuổi               *");
                    System.out.println("*            3. Địa chỉ            *");
                    System.out.println("*            4. Lối ra             *");
                    System.out.println("* * * * * * * * * * * * *  * * * * *");
                    break;
                case 2:
                    System.out.println("* * * * * Quản lý Bánh * * * * * * *");
                    System.out.println("*     1.   Bánh quy                *");
                    System.out.println("*     2.   Bánh bao                *");
                    System.out.println("*     3.   Bánh giò                *");
                    System.out.println("*     4.   Lối ra                  *");
                    System.out.println("* * * * * * * * * * * * *  * * * * *");
                    break;
                case 3:
                    System.out.println("* * * * Quản lý Dơn Hàng * * * * *");
                    System.out.println("*     1. Tên sản phẩm            *");
                    System.out.println("*     2. Số lượng                *");
                    System.out.println("*     3. Giá                     *");
                    System.out.println("*     4. Lối ra                  *");
                    System.out.println("* * * * * * * * * * * * *  * * * *");
                    break;
                case 4:
                    System.out.println("* * * * * * *  Menu * * * * * * * *");
                    System.out.println("*     1. Quản lý người dùng       *");
                    System.out.println("*     2. Quản lý Bánh             *");
                    System.out.println("*     3. Quản lý Dơn Hàng         *");
                    System.out.println("*     4. Lối ra                   *");
                    System.out.println("* * * * * * * * * * * * *  * * * * *");
                    break;
            }
        }
    }
    public static void Menu() {
        System.out.println("* * * * * * * * Menu * * * * * * *");
        System.out.println("*     1. Quản lý người dùng      *");
        System.out.println("*     2. Quản lý Bánh            *");
        System.out.println("*     3. Quản lý Đơn Hàng        *");
        System.out.println("*     4. Lối ra                  *");
        System.out.println("* * * * * * * * * * * * *  * * * *");
    }
}
