package mvc.controller;



import java.util.Scanner;

public class VehicleManager {

    static final Scanner scanner = new Scanner(System.in);

    public static void showMenu() {
        do {
            try {
                int select;
                System.out.println("===CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
                System.out.println("Chọn chức năng : ");
                System.out.println("1. Thêm mới phương tiện");
                System.out.println("2. Hiển thị phương tiện");
                System.out.println("3. Xóa phương tiện");
                System.out.println("4. Tìm kiếm theo biển kiểm soát");
                System.out.println("5. Thoát");
                System.out.println("Mời chọn chức năng : ");
                select = Integer.parseInt(scanner.nextLine());
                switch (select) {
                    case 1:
                        AddVehicle.showMenuAddVehicle();
                        break;
                    case 2:
                        ShowVehicle.showDisplayVehicle();
                        break;
                    case 3:
                        DelVehicle.showMenuDelVehicle();
                        break;
                    case 4:
                        SearchVehicle.showMenuSearchVehicle();
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("Thử lại");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập lại bạn ơi");
            }
        } while (true);
    }
}
