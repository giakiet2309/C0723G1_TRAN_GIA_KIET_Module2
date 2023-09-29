package case_study.service;

import case_study.model.person.Employee;

public interface IEmployeeService extends IFuramaService<Employee> {
    void editEmployee();

    void searchNameEmployee();

}
