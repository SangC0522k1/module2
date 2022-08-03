package bt_arraylist;

public class MyListTest {
    public static void main(String[] args) {
        System.out.println("****** (' = ') ******");
        MyList<Number> listNumber = new MyList<>(10);
        listNumber.add(0, 3);
        listNumber.add(1, 4);
        listNumber.add(2, 2);
        listNumber.add(3, 5);
        listNumber.add(4, 8);
        listNumber.add(5, 7);
        listNumber.add(6, 6);
        listNumber.add(20, 9);
        listNumber.printMyList();
        System.out.println(listNumber.get(7));
        if (listNumber.contains(6)) {
            System.out.println("Yes!");
        }else System.out.println("NO!");
        if (listNumber.contains(6)) {
            System.out.println("Yes!");
        }else System.out.println("NO!");

    }

}
