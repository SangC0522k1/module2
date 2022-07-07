import java.util.Scanner;

public class nam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("tháng bạn muốn điếm");
        int month = scanner.nextInt();
//        switch (month) {
//            case 2:
//                System.out.print("Tháng '2' có 28 hoặc 29 ngày!");
//                break;
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                System.out.print("Tháng '\"+ tháng +\"' có 31 ngày!");
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                System.out.print("Tháng '\"+ tháng +\"' có 30 ngày!");
//                break;
//            default:
//                System.out.print("Đầu vào k hợp lệ!");
//                break;
            String daysInMonth;
            switch (month) {
                case 2:
                    daysInMonth = "28 or 29";
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    daysInMonth = "31";
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysInMonth = "30";
                    break;
                default:
                    daysInMonth = "";
            }

            if (!daysInMonth.equals("")) System.out.printf("The month '%d' has %s days!", month, daysInMonth);
            else System.out.print("Invalid input!");
        }
    }
//}
