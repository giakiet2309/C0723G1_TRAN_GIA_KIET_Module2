package case_study.controller;

import case_study.service.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeController {

    private static EmployeeService employeeService = new EmployeeService();

    public static void showMenuEmployee() {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("======Employee Manager======");
            System.out.println("1. Display list employee");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Delete employee");
            System.out.println("5. Search by name employee");
            System.out.println("6. Return main menu");
            System.out.println("Choose number : ");
            try {
                select = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Type number pls ! ");
            }
            switch (select) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.add();
                    break;
                case 3:
                    employeeService.editEmployee();
                    break;
                case 4:
                    employeeService.delete();
                    break;
                case 5:
                    employeeService.searchNameEmployee();
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
