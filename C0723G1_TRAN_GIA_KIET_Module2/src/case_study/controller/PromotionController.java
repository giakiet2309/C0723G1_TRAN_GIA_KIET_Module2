package case_study.controller;

import java.util.Scanner;

public class PromotionController {
    public static void showMenuPromotion() {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("======Promotion Manager======");
            System.out.println("1.Display list customers use service");
            System.out.println("2.Display list customers get voucher");
            System.out.println("3. Return main menu");
            System.out.println("Choose number : ");
            try {
                select = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Type number pls ! ");
            }
            switch (select) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("Try again !");
            }
        } while (true);
    }
}
