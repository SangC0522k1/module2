package static_method;

import javax.sound.midi.Soundbank;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(1, " truc");
        Student s2 = new Student(2, " tien");
        Student s3 = new Student(3, " nhat");


        s1.display();
        s2.display();
        s3.display();
    }
}
