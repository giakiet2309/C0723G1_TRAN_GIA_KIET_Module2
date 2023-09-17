package mvc.controller;

import mvc.service.oto.OtoService;
import mvc.service.truck.TruckSercive;

import java.util.Scanner;

public class ShowVehicle {
    public static TruckSercive truckSercive = new TruckSercive();
    public static OtoService otoService = new OtoService();
    static final Scanner scanner = new Scanner(System.in);

    public static void showDisplayVehicle() {
        do {
            try {
                int select;
                System.out.println("=====Xem Phương Tiện=====");
                System.out.println("1. Hiển thị xe tải");
                System.out.println("2. Hiển thị ôtô");
                System.out.println("3. Hiển thị xe máy");
                System.out.println("4.Trở về menu chính");
                System.out.println("Mời chọn chức năng : ");
                select = Integer.parseInt(scanner.nextLine());
                switch (select) {
                    case 1:
                        truckSercive.showTruck();
                        break;
                    case 2:
                        otoService.showOto();
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
