package mvc.service.oto;

import mvc.controller.VehicleManager;
import mvc.model.Oto;
import mvc.repository.oto.OtoRepository;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.Scanner;

public class OtoService implements IOtoService {
    public static OtoRepository otoRepository = new OtoRepository();
    static final Scanner scanner = new Scanner(System.in);

    @Override
    public void addOto() {
        System.out.println("Nhập biển kiểm soát ");
        int numberPlate = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập hãng sản xuất theo tên này ( 1 : VinPhat , 2 : Mẹc , 3 : XeBò");
        String nameTheFirm = scanner.nextLine();
        System.out.println("Nhập năm sản xuất vào đây");
        String yearOfManufacture = scanner.nextLine();
        System.out.println("Nhập chủ sỡ hữu vào đây");
        String owner = scanner.nextLine();
        System.out.println("Nhập số chỗ ngồi vào đây");
        String numberOfSeats = scanner.nextLine();
        System.out.println("Nhập kiểu xe theo tên này ( 1 : Du Lịch , 2 : Xe khách");
        String carType = scanner.nextLine();
        Oto oto = new Oto(numberPlate, nameTheFirm, yearOfManufacture, owner, numberOfSeats, carType);
        otoRepository.addOto(oto);
    }

    @Override
    public void showOto() {
        List<Oto> otoList = otoRepository.showOto();
        for (Oto oto : otoList) {
            System.out.println(oto);
        }
    }

    @Override
    public void delOto() {
        System.out.println("Nhập biển kiểm soát cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        if (otoRepository.checkIdOto(id)) {
            if (confirmDelete()) {
                if (otoRepository.delOto(id)) {
                    System.out.println("Đã xóa thành công");
                }
            } else {
                VehicleManager.showMenu();
            }
        } else {
            System.out.println("Id Không tồn tại");
        }
    }

    @Override
    public void searchOto() {
        System.out.println("Nhập biển kiểm soát cần tìm");
        int id = Integer.parseInt(scanner.nextLine());
        if(otoRepository.checkIdOto(id)){
            System.out.println(otoRepository.searchOto(id));
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

}
