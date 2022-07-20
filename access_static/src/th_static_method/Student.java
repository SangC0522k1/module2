package th_static_method;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    Student(int r, String n) {
        rollno = r;
        name = n;
    }
    static void change() {
        college = " C0522k1";
    }
    void display() {
        System.out.println(rollno + "" + name + "" + college );
    }
}
