package mvc.controller;

import mvc.service.oto.OtoService;
import mvc.service.truck.TruckSercive;

import java.util.Scanner;

 public class  AddVehicle {
     public static TruckSercive truckSercive = new TruckSercive();

     public static OtoService otoService = new OtoService();
    static final Scanner scanner = new Scanner(System.in);

    public static void showMenuAddVehicle() {
        do {
            try {
                int select;
                System.out.println("=====Thêm Phương Tiện=====");
                System.out.println("1. Thêm xe tải");
                System.out.println("2. Thêm ôtô");
                System.out.println("3. Thêm xe máy");
                System.out.println("4.Trở về menu chính");
                System.out.println("Mời chọn chức năng : ");
                select = Integer.parseInt(scanner.nextLine());
                switch (select){
                    case 1 :
                        truckSercive.addTruck();
                        break;
                    case 2:
                        otoService.addOto();
                        break;
                    case 3 :
                        break;
                    case 4 :
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
