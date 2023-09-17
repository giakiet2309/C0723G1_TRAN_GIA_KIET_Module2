package mvc.controller;

import mvc.model.Truck;
import mvc.service.oto.OtoService;
import mvc.service.truck.TruckSercive;

import java.util.Scanner;

public class DelVehicle {
    public static TruckSercive truckSercive = new TruckSercive();
    public static OtoService otoService = new OtoService();
    static final Scanner scanner = new Scanner(System.in);
    public static void showMenuDelVehicle() {
        do {
            try {
                int select;
                System.out.println("=====Xóa Phương Tiện=====");
                System.out.println("1. Xóa xe tải");
                System.out.println("2. Xóa ôtô");
                System.out.println("3. Xóa xe máy");
                System.out.println("4.Trở về menu chính");
                System.out.println("Mời chọn chức năng : ");
                select = Integer.parseInt(scanner.nextLine());
                switch (select) {
                    case 1:
                    truckSercive.delTruck();
                        break;
                    case 2:
                    otoService.delOto();
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
