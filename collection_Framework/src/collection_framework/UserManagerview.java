package collection_framework.view;

import collection_framework.service.ProductManager;
import collection_framework.service.UserManager;

import java.util.Scanner;

public class UserManagerview {
    public static void main(String[] args) {
        UserManagerview userManagerview = new UserManagerview();
        userManagerview.userManagerview();
    }

    UserManager userManager = new UserManager();

    public void userManagerview() {
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("|------------------------------------------------------------|" +
                        "\n|                                                            |" +
                        "\n|                      Users-Menu                            |" +
                        "\n|                     1 show                                 |" +
                        "\n|                     2 search                               |" +
                        "\n|                     3 sortByPriceASC                       |" +
                        "\n|                     4 sortByPriceDESC                      |" +
                        "\n|                     e Exit                                 |" +
                        "\n|------------------------------------------------------------|" +
                        "\nType a number above by your choice:                          ");
                        String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        userManager.renderProduct();
                        break;

                    case "2":
                        userManager.searchProductByName();
                        break;

                    case "3":
                        userManager.sortByPriceASC();
                        break;

                    case "4":
                        userManager.sortByPriceDESC();
                        break;
                    case "e":
                        System.out.println("■ Exiting the application successfully!");
                        System.exit(0);

                    default:
                        System.out.println("■ Invalid selected number, please try again!");

                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

