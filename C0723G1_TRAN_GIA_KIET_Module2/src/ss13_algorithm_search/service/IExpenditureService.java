package ss13_algorithm_search.service;

import ss13_algorithm_search.model.Expenditure;

public interface IExpenditureService {
    void display();

    void add();

    void delete();

    void edit();

    void searchById();

    void searchByName();
}
