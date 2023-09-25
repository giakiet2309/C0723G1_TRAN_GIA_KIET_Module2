package ss17_binary_file.service;

import ss17_binary_file.exeptions.IdNotFoundException;
import ss17_binary_file.exeptions.UniqueIdException;
import ss17_binary_file.model.Expenditure;
import ss17_binary_file.repository.ExpenditureRepository;
import ss17_binary_file.service.IExpenditureService;

import java.util.List;
import java.util.Scanner;

public class ExpenditureService implements IExpenditureService {
    public static ExpenditureRepository expenditureRepository = new ExpenditureRepository();

    static final Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<Expenditure> expenditureList = expenditureRepository.display();
        if (!expenditureList.isEmpty()) {
            for (Expenditure expenditure : expenditureList) {
                System.out.println(expenditure);
            }
        } else {
            System.out.println("Danh sách trống");
        }

    }

    @Override
    public void add() {
        int id;
        System.out.println("Nhập id chi tiêu : ");
        id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chi tiêu : ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày chi : ");
        String date = scanner.nextLine();
        System.out.println("Nhập số tiền chi : ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mô tả : ");
        String describe = scanner.nextLine();
        System.out.println("Thêm mới chi tiêu thành công !! ");
        Expenditure expenditure = new Expenditure(id, name, date, price, describe);
        expenditureRepository.add(expenditure);
    }

    @Override
    public void delete() {
        int id;
        do {
            System.out.println("Nhập id muốn xóa");
            try {
                id = Integer.parseInt(scanner.nextLine());
                if (!expenditureRepository.delete(id)) {
                    throw new IdNotFoundException("Id không tồn tại");
                } else {
                    System.out.println("Xóa thành công");
                    break;
                }
            } catch (IdNotFoundException e) {
                System.err.println(e.getMessage());
            }

        } while (true);
    }

    @Override
    public void edit() {
        int id;
        System.out.println("Nhập id chi tiêu muốn sửa : ");
        id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chi tiêu : ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày chi : ");
        String date = scanner.nextLine();
        System.out.println("Nhập số tiền chi : ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mô tả : ");
        String describe = scanner.nextLine();
        System.out.println("Sửa mới chi tiêu thành công !! ");
        Expenditure expenditure = new Expenditure(id, name, date, price, describe);
        expenditureRepository.edit(id, expenditure);
    }

    @Override
    public void searchById() {
        System.out.println("Nhập id của chi tiêu muốn tìm");
        int id = Integer.parseInt(scanner.nextLine());
        List<Expenditure> expenditureList = expenditureRepository.searchById(id);
        if (expenditureList.size() == 0) {
            System.out.println("Không có chỉ tiêu này");
        } else {
            for (Expenditure expenditure : expenditureList) {
                System.out.println(expenditure);
            }
        }
    }


    @Override
    public void searchByName() {
        System.out.println("Nhập keyword chi tiêu muốn tìm");
        String name = scanner.nextLine();
        List<Expenditure> expenditureList = expenditureRepository.searchByName(name);
        if (expenditureList.size() == 0) {
            System.out.println("Không có chi tiêu này");
        } else {
            for (Expenditure expenditure : expenditureList) {
                System.out.println(expenditure);
            }
        }

    }

    @Override
    public void sortByNameAscending() {
        List<Expenditure> expenditureList = expenditureRepository.sortByNameAscending();
        for (Expenditure expenditure : expenditureList) {
            System.out.println(expenditure);
        }
    }

    @Override
    public void sortByPriceDecrease() {
        List<Expenditure> expenditureList = expenditureRepository.sortByPriceDecrease();
        for (Expenditure expenditure : expenditureList) {
            System.out.println(expenditure);
        }
    }
}
