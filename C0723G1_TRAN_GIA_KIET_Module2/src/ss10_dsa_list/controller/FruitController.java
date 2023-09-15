package ss10_dsa_list.controller;

import ss10_dsa_list.service.FruitService;

import java.util.Scanner;

public class FruitController {
    public static FruitService fruitService = new FruitService();
    static final Scanner scanner = new Scanner(System.in);

    public static void showMenu() {
        do {
            try {
                int select;
                System.out.println("=====FruitManager=====");
                System.out.println("1. Danh sách hoa quả ");
                System.out.println("2. Thêm hoa quả");
                System.out.println("3. Thoát");
                System.out.println("Hãy chọn chức năng");
                select = Integer.parseInt(scanner.nextLine());
                switch (select) {
                    case 1:
                        fruitService.display();
                        break;
                    case 2:
                        fruitService.addFruit();
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Thử lại");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập số đi ạ");
            }
        } while (true);
    }
}
