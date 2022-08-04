package bt_linkedlist;

public class MyLinkedListText {
    public static void main(String[] args) {

         class Student {
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }


        MyLinkList<Student> myLinkList = new MyLinkList<>();
        Student s1 = new Student(1, "Sang Minh");
        Student s2 = new Student(2, "Sang Đặng");
        Student s3 = new Student(3, "Minh Sang");
        Student s4 = new Student(4, " Sang");
        Student s5 = new Student(4, " Minh S");
        Student s6 = new Student(4, " Đặng MInh Sang");
        myLinkList.addFirst(s1);
        myLinkList.add(2,s2);
        myLinkList.addLast(s3);
        myLinkList.addFirst(s4);
//        myLinkList.remove(3);

        MyLinkList<Student> cloneLinklist = myLinkList.clone();

        System.out.println(myLinkList.contains(s4));
        System.out.println(myLinkList.indexOf(s5));


        System.out.println(myLinkList.size());
        for (int i = 0; i < myLinkList.size(); i++) {
            Student student = (Student) myLinkList.get(i);
            System.out.println(student.getName());
        }
    }
}
