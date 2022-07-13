public class Tim_gia_tri_nho_nhat_trong_mang {
    public static void main(String[] args) {
        int[] array = {5, 12, 7, 6, 3, 9, 10};
        int index = minValue(array);
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + array[index]);
    }

    public static int minValue (int[] array) {
       int index = 0;
       for (int i = 1; i < array.length; i++) {
           if (array[i] < array[index]) {
               index = i;
           }
       }
       return index;
    }
}
