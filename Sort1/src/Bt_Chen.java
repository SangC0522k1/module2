public class Bt_Chen {

        public void insertionSort(int arr[]) {
            int ValueSort;
            int HoleSort;
            int i;
            for (i = 1; i < arr.length; i++) {
                ValueSort = arr[i];
                HoleSort = i;
                while (HoleSort > 0 && arr[HoleSort - 1] > ValueSort) {
                    arr[HoleSort] = arr[HoleSort - 1];
                    HoleSort--;
                    System.out.println("Di chuyen phan tu: " + arr[HoleSort]);
                }

                if (HoleSort != i) {
                    System.out.println(" Chen phan tu: " + ValueSort
                            + ", tai vi tri: " + HoleSort);
                    arr[HoleSort] = ValueSort;
                }

                System.out.println("Vong lap thu " + i);
                display(arr);
            }
        }
        public void display(int arr[]) {
            int i;
            System.out.print("[");
            for (i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ", ");
            }

            System.out.print("]\n");
        }
        public static void main(String[] args) {
            int arr[] = {5, 2, 3, 4, 9, 6, 11, 22, 15};
            Bt_Chen SXC = new Bt_Chen();
            System.out.println("Mang du lieu dau vao: ");
            SXC.display(arr);
            System.out.println("-----------------------------");
            SXC.insertionSort(arr);
            System.out.println("-----------------------------");
            System.out.println("\nMang sau khi da sap xep: ");
            SXC.display(arr);
        }
}
