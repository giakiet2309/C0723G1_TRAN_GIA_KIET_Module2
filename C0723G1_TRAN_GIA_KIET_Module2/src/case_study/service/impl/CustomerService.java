package case_study.service.impl;

import case_study.model.person.Customer;
import case_study.model.person.Employee;
import case_study.repository.impl.CustomerRepository;
import case_study.service.ICustomerService;
import case_study.utils.Regex;
import case_study.utils.Validator;

import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static CustomerService customerService = new CustomerService();

    private static CustomerRepository customerRepository = new CustomerRepository();

    Scanner scanner = new Scanner(System.in);

    @Override
    public void editCustomer() {
        String newName;
        String newAge = null;
        String newGender;
        String newIdentityNumber;
        String newTelephone;
        String newEmail;
        String newLevel;
        String newAddress;
        String sub = "";
        boolean check;
        System.out.println("Nhập vào ID của khách hàng muốn sửa");
        String id = scanner.nextLine();
        if (customerRepository.checkId(id)) {
            do {
                check = false;
                System.out.println("Nhập tên của khách hàng vào đây ");
                newName = scanner.nextLine();
                if (Validator.validateName(newName)) {
                    check = true;
                } else {
                    System.out.println("Tên không đúng định dạng");
                }
            } while (!check);
            do {
                check = false;
                try {
                    System.out.println("Nhập ngày tháng năm sinh của khách hàng vào đây");
                    newAge = scanner.nextLine();
                    if (Validator.validateAge(newAge)) {
                        check = true;
                    } else {
                        System.out.println("Tuổi khách hàng phải  18 trở lên ");
                    }
                } catch (DateTimeParseException e) {
                    System.out.println(" Ngày tháng gì đấy ?? VD : dd/MM/yyyy ");
                }

            } while (!check);
            do {
                check = false;
                System.out.println("Nhập Giới tính khách hàng vào đây" + sub + ",Nam-1/Nữ-2");
                newGender = scanner.nextLine();
                if (Regex.checkIsMale(newGender)) {
                    check = true;
                } else {
                    System.out.println("gì đấy");
                }
            } while (!check);
            do {
                check = false;
                System.out.println("Nhập CMND khách hàng vào đây");
                newIdentityNumber = scanner.nextLine();
                if (Regex.validateIdentNumber(newIdentityNumber)) {
                    check = true;
                } else {
                    System.out.println("CMND phải đủ 9 hoặc 12 số");
                }
            } while (!check);
            do {
                check = false;
                System.out.println("Nhập số điện thoại khách hàng vào đây");
                newTelephone = scanner.nextLine();
                if (Regex.validatePhoneNumber(newTelephone)) {
                    check = true;
                } else {
                    System.out.println("SĐT phải bắt đầu từ 0 và đủ 10 số");
                }
            } while (!check);
            while (true) {
                System.out.println("Mời nhập vào email khách hàng " + sub);
                newEmail = scanner.nextLine();
                if (Regex.checkEmail(newEmail)) {
                    break;
                }
                System.err.println("Sai format Email ");
            }
            while (true) {
                System.out.println("Mời nhập vào loại khách hàng " + sub + ": Diamond, Platinum,Gold,Silver,Member ");
                newLevel = scanner.nextLine();
                if (Regex.checkEducationCustomer(newLevel)) {
                    break;
                }
                System.err.println(newLevel + " Không hợp lệ");
            }
            System.out.println("Nhập Địa chỉ vào đây");
            newAddress = scanner.nextLine();
            System.out.println("Sửa Khách hàng thành công !");
            Customer customer = new Customer(id, newName, newAge, newGender, newIdentityNumber, newTelephone, newEmail, newLevel, newAddress);
            customerRepository.editCustomer(id, customer);
        } else {
            System.out.println("ID không tồn tại");
            customerService.editCustomer();
        }
    }

    @Override
    public void searchNameCustomer() {
        System.out.println("Nhập tên khách hàng muốn tìm");
        String name = scanner.nextLine();
        for (Customer customer : customerRepository.display()) {
            if (!customerRepository.searchNameCustomer(name).isEmpty()) {
                System.out.println(customer);
            } else {
                System.out.println("Không có tên khách hàng này");
            }
        }
    }

    @Override
    public void add() {
        String id;
        String name;
        String age = null;
        String gender;
        String identityNumber;
        String telephone;
        String email;
        String level;
        String address;
        String sub = "";
        boolean check;
        do {
            check = false;
            System.out.println("Nhập mã khách hàng vào đây");
            id = scanner.nextLine();
            if (!customerRepository.checkId(id)) {
                if (Regex.validateCustomerId(id)) {
                    check = true;
                } else {
                    System.out.println("Id không đúng định dạng");
                }
            } else {
                System.out.println("ID đã tồn tại");
            }

        } while (!check);
        do {
            check = false;
            System.out.println("Nhập tên của khách hàng vào đây ");
            name = scanner.nextLine();
            if (Validator.validateName(name)) {
                check = true;
            } else {
                System.out.println("Tên không đúng định dạng");
            }
        } while (!check);
        do {
            check = false;
            try {
                System.out.println("Nhập ngày tháng năm sinh của khách hàng vào đây");
                age = scanner.nextLine();
                if (Validator.validateAge(age)) {
                    check = true;
                } else {
                    System.out.println("Tuổi khách hàng phải  18 trở lên ");
                }
            } catch (DateTimeParseException e) {
                System.out.println(" Ngày tháng gì đấy ?? VD : dd/MM/yyyy ");
            }

        } while (!check);
        do {
            check = false;
            System.out.println("Nhập Giới tính khách hàng vào đây" + sub + ",Nam-1/Nữ-2");
            gender = scanner.nextLine();
            if (Regex.checkIsMale(gender)) {
                check = true;
            } else {
                System.out.println("gì đấy");
            }
        } while (!check);
        do {
            check = false;
            System.out.println("Nhập CMND khách hàng vào đây");
            identityNumber = scanner.nextLine();
            if (Regex.validateIdentNumber(identityNumber)) {
                check = true;
            } else {
                System.out.println("CMND phải đủ 9 hoặc 12 số");
            }
        } while (!check);
        do {
            check = false;
            System.out.println("Nhập số điện thoại khách hàng vào đây");
            telephone = scanner.nextLine();
            if (Regex.validatePhoneNumber(telephone)) {
                check = true;
            } else {
                System.out.println("SĐT phải bắt đầu từ 0 và đủ 10 số");
            }
        } while (!check);
        while (true) {
            System.out.println("Mời nhập vào email khách hàng " + sub);
            email = scanner.nextLine();
            if (Regex.checkEmail(email)) {
                break;
            }
            System.err.println("Sai format Email ");
        }
        while (true) {
            System.out.println("Mời nhập vào loại khách hàng " + sub + ": Diamond, Platinum,Gold,Silver,Member ");
            level = scanner.nextLine();
            if (Regex.checkEducationCustomer(level)) {
                break;
            }
            System.err.println(level + "Không hợp lệ");
        }
        System.out.println("Nhập Địa chỉ vào đây");
        address = scanner.nextLine();
        System.out.println("ADD Khách hàng thành công !");
        Customer customer = new Customer(id, name, age, gender, identityNumber, telephone, email, level, address);
        customerRepository.add(customer);
    }

    @Override
    public void delete() {
        System.out.println("Nhập ID cần xóa");
        String id = scanner.nextLine();
        if (customerRepository.delete(id)) {
            System.out.println("Đã xóa thành công");
        } else {
            System.out.println("Không tìm thấy ID");
            customerService.delete();
        }
    }

    @Override
    public void display() {
        List<Customer> customerList = customerRepository.display();
        if (customerList.isEmpty()) {
            System.out.println("Danh sách trống");
        } else {
            for (Customer customer : customerList) {
                System.out.println(customer);
            }
        }
    }
}
