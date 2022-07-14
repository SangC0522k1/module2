import java.util.Scanner;

public class Minh_hoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("kích thước danh sách:");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + "giá trị:");
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        System.out.print("Danh sách đầu vào của bạn:");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

    }
    public static void bubbleSortByStep(int[] list){
        boolean snb=true;
        for(int a = 1;a < list.length && snb; a++){
            snb=false;
            for(int i = 0;i < list.length-a; i++){
                if(list[i] > list[i+1]) {
                    System.out.println("Tráo đổi" + list[i] + "với" + list[i+1]);
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    snb = true;
                }
            }
            if (snb == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.print("List after the  " + a + "' sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nBắt đầu xử lý sắp xếp ...");
        bubbleSortByStep(list);
    }
}
