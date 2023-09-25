package ss17_binary_file.service;

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
