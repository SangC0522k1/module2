package th1_trienkhaiStack;

import static th1_trienkhaiStack.MyGenericStack.stackOfIStrings;
import static th1_trienkhaiStack.MyGenericStack.stackOfIntegers;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}
