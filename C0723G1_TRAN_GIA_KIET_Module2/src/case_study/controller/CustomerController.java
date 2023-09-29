package case_study.controller;

import case_study.service.impl.CustomerService;

import java.util.Scanner;

public class CustomerController {
    private static CustomerService customerService = new CustomerService();
    public static void showMenuCustomer() {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("======Customer Manager======");
            System.out.println("1. Display list customer");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Delete customer");
            System.out.println("5. Search by name customer");
            System.out.println("6. Return main menu");
            System.out.println("Choose number : ");
            try {
                select = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Type number pls ! ");
            }
            switch (select) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.add();
                    break;
                case 3:
                    customerService.editCustomer();
                    break;
                case 4:
                    customerService.delete();
                    break;
                case 5:
                    customerService.searchNameCustomer();
                    break;
                case 6:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("Try again !");
            }
        } while (true);
    }
}
