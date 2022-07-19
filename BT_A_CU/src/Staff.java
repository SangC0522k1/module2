import java.util.Scanner;

public class Staff {
    public String name;
    public String email;

    public Staff(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "name ='" + name + '\'' +
                ", email ='" + email + '\'';

    }

    public static void main(String[] args) {
        Staff staff = new Staff("David", "david@gmail.com");
        Staff staff1 = new Staff("Kien Le","kienle@gmail.com");
        Staff staff2 = new Staff("Nhat ho","nhatho@gmail.com");
        System.out.println(staff);
        System.out.println(staff1);
        System.out.println(staff2);


    }
}
