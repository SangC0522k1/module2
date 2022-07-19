import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        launch();
    }
    public static void launch() {
        do {
            mainMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nChọn chức năng ");
            System.out.print("⭆ ");
            int number = scanner.nextInt();
            switch (number) {
                case 0:
                    System.exit(0);
                case 1:
                    userOption();
                    break;
                case 2:
                    System.out.println("San PHam");
                    break;
                case 3:
                    System.out.println("Hoa Don");
                    break;
                default:
                    System.out.println("Chọn chức năng không đúng! Vui lòng chọn lại");
            }
        } while (true);
    }
    public static void mainMenu() {
        System.out.println("⚪ ⚪ ⚪ ⚪ ⚪  CHÀO MỪNG TỚI KIOT VIET  ⚪ ⚪ ⚪ ⚪ ⚪");
        System.out.println("⚪                                      ⚪");
        System.out.println("⚪     1. Quản lý người dùng              ⚪");
        System.out.println("⚪     2. Quản lý đồ uống                  ⚪");
        System.out.println("⚪     3. Quản lý hóa đơn                ⚪");
        System.out.println("⚪     0. Thoát                            ⚪");
        System.out.println("⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪");
    }
    public static void userOption() {
        int option;
        do {
            userMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nChọn chức năng ");
            System.out.print("⭆ ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("THem thanh cong");
                    break;
                case 2:
                    System.out.println("Sua thanh cong");
                case 8:
                    break;
                default:
                    System.out.println("Chọn chức năng không đúng! Vui lòng chọn lại");
            }
        } while (option != 8);
    }
    public static void userMenu() {
        System.out.println("⚪ ⚪ ⚪ ⚪ ⚪  USERS MANAGER  ⚪ ⚪ ⚪ ⚪ ⚪");
        System.out.println("⚪                                      ⚪");
        System.out.println("⚪     1. Thêm người dùng               ⚪");
        System.out.println("⚪     2. Sửa thông tin người dùng      ⚪");
        System.out.println("⚪     3. Hiện danh sách người dùng     ⚪");
        System.out.println("⚪                                   ⚪");
        System.out.println("Nhấn '8' để trở lại \t|\t '9' để thoát chương trình");
        System.out.println("⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪");
    }
}
