package dao_nguoc_stack;

import java.util.Scanner;
import java.util.Stack;

public class bt_dao_nguoc_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> reverse = new Stack<String>();

        System.out.println("Nhap vao cac so hoac chuoi");
        String s = sc.nextLine();
        for (int i = 0; i <s.length() ; i++) {
            reverse.push(s.charAt(i) + "");
        }
        System.out.println("chuoi dao nguoc: ");
        for (int i = 0; i <s.length() ; i++) {
            System.out.print(reverse.pop());
        }
    }
}
