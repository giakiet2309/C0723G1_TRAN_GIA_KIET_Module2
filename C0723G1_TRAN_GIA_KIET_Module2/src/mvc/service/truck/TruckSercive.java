package mvc.service.truck;

import mvc.controller.VehicleManager;
import mvc.model.Truck;
import mvc.repository.truck.TruckRepository;

import java.util.List;
import java.util.Scanner;

public class TruckSercive implements ITruckService {

    public static TruckRepository truckRepository = new TruckRepository();
    static final Scanner scanner = new Scanner(System.in);

    @Override
    public void addTruck() {
        System.out.println("Nhập biển kiểm soát ");
        int numberPlate = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập hãng sản xuất theo số  này ( 1 : VinPhat , 2 : Mẹc , 3 : XeBò");
        String nameTheFirm = scanner.nextLine();
        System.out.println("Nhập năm sản xuất vào đây");
        String yearOfManufacture = scanner.nextLine();
        System.out.println("Nhập chủ sỡ hữu vào đây");
        String owner = scanner.nextLine();
        System.out.println("Nhập tải trọng vào đây");
        String tonnage = scanner.nextLine();
        System.out.println("Thêm xe tải thành công");
        Truck truck = new Truck(numberPlate, nameTheFirm, yearOfManufacture, owner, tonnage);
        truckRepository.addTruck(truck);
    }

    @Override
    public void showTruck() {
        List<Truck> truckList = truckRepository.showTruck();
        for (Truck truck : truckList) {
            System.out.println(truck);
        }
    }

    @Override
    public void delTruck() {
        System.out.println("Nhập biển kiểm soát cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        if (truckRepository.checkIdTruck(id)) {
            if (confirmDelete()) {
                if (truckRepository.delTruck(id)) {
                    System.out.println("Đã xóa thành công");
                }
            } else {
                VehicleManager.showMenu();
            }
        } else {
            System.out.println("Id không tồn tại");
        }
    }

    public boolean confirmDelete() {
        System.out.println("Bạn có chắc chắn muốn xoá không? (Nhập 'yes' để xác nhận, 'no' để huỷ ");
        String confirm = scanner.nextLine();
        if (confirm.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public void searchTruck() {
        System.out.println("Nhập biển kiểm soát cần tìm ");
        int id = Integer.parseInt(scanner.nextLine());
        if (truckRepository.checkIdTruck(id)) {
            System.out.println(truckRepository.searchTruck(id));

        } else {
            System.out.println("Không có id này");
        }
    }


}
