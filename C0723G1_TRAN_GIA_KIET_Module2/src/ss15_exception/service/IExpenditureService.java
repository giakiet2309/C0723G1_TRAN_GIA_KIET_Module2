package ss15_exception.service;

public interface IExpenditureService {
    void display();

    void add();

    void delete();

    void edit();

    void searchById();

    void searchByName();

    void sortByNameAscending();

    void sortByPriceDecrease();
}
