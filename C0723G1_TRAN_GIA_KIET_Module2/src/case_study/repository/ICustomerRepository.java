package case_study.repository;

import case_study.model.person.Customer;

import java.util.List;

public interface ICustomerRepository extends IFurameRepo<Customer> {
    void editCustomer(String id , Customer customer);

    List<Customer> searchNameCustomer(String string);
}
