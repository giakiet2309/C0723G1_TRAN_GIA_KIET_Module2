package ss13_algorithm_search.controller;

import ss13_algorithm_search.service.ExpenditureService;

import java.util.Scanner;

public class ExpenditureController {
    static final ExpenditureService expenditureService = new ExpenditureService();

    static final Scanner scanner = new Scanner(System.in);

    public static void showMenu() {
        do {
            try {
                int select;
                System.out.println("=====Quản lí công việc=====");
                System.out.println("1. Hiển thị danh sách");
                System.out.println("2. Thêm ");
                System.out.println("3. Xóa");
                System.out.println("4. Sửa");
                System.out.println("5. Tìm kiếm theo mã chỉ tiêu");
                System.out.println("6. Tìm kiếm gần đúng theo tên chỉ tiêu");
                System.out.println("0. Thoát");
                System.out.println("Nhập lựa chọn của b : ");
                select = Integer.parseInt(scanner.nextLine());
                switch (select) {
                    case 1:
                        expenditureService.display();
                        break;
                    case 2:
                        expenditureService.add();
                        break;
                    case 3:
                        expenditureService.delete();
                        break;
                    case 4:
                        expenditureService.edit();
                        break;
                    case 5:
                        expenditureService.searchById();
                        break;
                    case 6:
                        expenditureService.searchByName();
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Không hợp lệ , nhập từ 0-6 thui");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập số bạn ơi");
            }
        } while (true);
    }
}
