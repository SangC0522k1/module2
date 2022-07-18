public class TH_Nhi_phan_KDQ {
    static int[] list = {2, 5, 8, 10, 15, 20, 26, 35, 62, 75, 90};
    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
             if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,35));
//        System.out.println(binarySearch(list,5));
//        System.out.println(binarySearch(list,8));
//        System.out.println(binarySearch(list,10));
//        System.out.println(binarySearch(list,15));
//        System.out.println(binarySearch(list,20));
//        System.out.println(binarySearch(list,26));
    }

}
