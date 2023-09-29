package case_study.repository;

import case_study.model.person.Employee;

import java.util.List;

public interface IEmployeeRepository extends IFurameRepo<Employee> {
    void editEmployee(String id , Employee employee);

    List<Employee> searchNameEmployee(String string);

}
