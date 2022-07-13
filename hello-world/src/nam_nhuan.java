import java.util.Scanner;

public class Nam_nhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a ");
        year = scanner.nextInt();
        boolean isleapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400) {
                    isleapYear = true;
                }
            }else {
                isleapYear = true;
            }
        }
        if(isleapYear) {
            System.out.printf("%d is a leap year", year);
        }else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}
