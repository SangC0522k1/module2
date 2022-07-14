public class Thuc_hanh1 {
    static int[] list = {2, 4, 7, 1, -2, 8, 9, 12, 14};

    private static void bubbleSort(int[] list) {
        boolean Sb = true;
        for (int a = 0; a < list.length && Sb; a++) {
            Sb = false;
            for (int i = 0; i > list.length - a; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    Sb = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + ",");
    }


}
