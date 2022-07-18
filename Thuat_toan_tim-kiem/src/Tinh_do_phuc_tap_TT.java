import java.util.Scanner;

public class Tinh_do_phuc_tap_TT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một chuỗi:");
        String inputString = scanner.nextLine();
        int[] frequentChar = new int[255];                         //{1}
        for (int i = 0; i < inputString.length(); i++) {           //{2}
            int ascii = (int) inputString.charAt(i);               //{3}
            frequentChar[ascii] += 1;                              //{4}
        }
        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < 255; j++) {
            if (frequentChar[j] > max) {
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("Chữ cái xuất hiện nhiều nhất là '" + character + "' với tần suất " + max + " lần");
    }
}
