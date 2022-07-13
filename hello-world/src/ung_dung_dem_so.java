import java.util.Scanner;

public class Ung_dung_dem_so {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập kích thước: ");
            size = sc.nextInt();
            if (size > 30)
                System.out.println("Kích thước không được vượt quá 30");
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập điểm cho học sinh " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        int count = 0;
        System.out.print("danh sách: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\n Số học sinh vượt qua kỳ thi là " + count);
    }
}
