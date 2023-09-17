package mvc.controller;

import mvc.service.oto.OtoService;
import mvc.service.truck.TruckSercive;

import java.util.Scanner;

public class SearchVehicle {
    public static TruckSercive truckSercive = new TruckSercive();
    public static OtoService otoService = new OtoService();
    static final Scanner scanner = new Scanner(System.in);

    public static void showMenuSearchVehicle() {
        do {
            try {
                int select;
                System.out.println("=====Tìm Phương Tiện=====");
                System.out.println("1. Tìm xe tải");
                System.out.println("2. Tìm ôtô");
                System.out.println("3. Tìm xe máy");
                System.out.println("4.Trở về menu chính");
                System.out.println("Mời chọn chức năng : ");
                select = Integer.parseInt(scanner.nextLine());
                switch (select) {
                    case 1:
                        truckSercive.searchTruck();
                        break;
                    case 2:
                        otoService.searchOto();
                        break;
                    case 3:
                        break;
                    case 4:
                        VehicleManager.showMenu();
                    default:
                        System.out.println("Thử lại");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập số vào bạn ơi");
            }
        } while (true);

    }
}
