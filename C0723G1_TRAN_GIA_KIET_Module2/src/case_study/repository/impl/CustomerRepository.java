package case_study.repository.impl;

import case_study.model.person.Customer;
import case_study.model.person.Employee;
import case_study.repository.ICustomerRepository;
import case_study.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String FILE_PATCH = "C:\\Users\\Gia Kiet\\Desktop\\module 2\\C0723G1_TRAN_GIA_KIET_Module2\\C0723G1_TRAN_GIA_KIET_Module2\\src\\case_study\\data\\customer.csv";

    @Override
    public void editCustomer(String id, Customer customer) {
        List<Customer> customerList = this.display();
        for (Customer p : customerList) {
            if (p.getId().equals(id)) {
                p.setName(customer.getName());
                p.setDate(customer.getDate());
                p.setEmail(customer.getEmail());
                p.setGender(customer.getGender());
                p.setCitizenId(customer.getCitizenId());
                p.setTelephone(customer.getTelephone());
                p.setAddress(customer.getAddress());
                p.setTypeOfCustomer(customer.getTypeOfCustomer());
                List<String> stringList = converToString(customerList);
                ReadAndWrite.write(FILE_PATCH, stringList);
            }
        }
    }

    @Override
    public List<Customer> searchNameCustomer(String string) {
        List<Customer> newName = this.display();
        List<Customer> result = new ArrayList<>();
        for (Customer customer : newName) {
            if (customer.getName().contains(string)) {
                result.add(customer);
            }
        }
        return result;
    }

    @Override
    public void add(Customer customer) {
        List<Customer> customerList = this.display();
        customerList.add(customer);
        List<String> stringList = converToString(customerList);
        ReadAndWrite.write(FILE_PATCH, stringList);
    }

    @Override
    public boolean delete(String id) {
        List<Customer> customerList = this.display();
        for (Customer p : customerList) {
            if (p.getId().equals(id)) {
                customerList.remove(p);
                List<String> stringList = converToString(customerList);
                ReadAndWrite.write(FILE_PATCH, stringList);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Customer> display() {
        List<String> stringList = ReadAndWrite.read(FILE_PATCH);
        List<Customer> customerList = new ArrayList<>();
        String[] arr;
        for (String p : stringList) {
            arr = p.split(",");
            customerList.add(new Customer(arr[0], arr[1], arr[2], arr[3], arr[4],
                    arr[5], arr[6], arr[7], arr[8]));
        }
        return customerList;
    }

    public boolean checkId(String id) {
        List<Customer> customerList = this.display();
        for (Customer p : customerList) {
            if (p.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public static List<String> converToString(List<Customer> customerList) {
        List<String> stringList = new ArrayList<>();
        for (Customer customer : customerList) {
            stringList.add(customer.getId() + "," + customer.getName() + ","
                    + customer.getDate() + "," + customer.getGender() + "," + customer.getCitizenId()
                    + "," + customer.getTelephone() + "," + customer.getEmail() + ","
                    + customer.getTypeOfCustomer() + "," + customer.getAddress());

        }
        return stringList;
    }
}
