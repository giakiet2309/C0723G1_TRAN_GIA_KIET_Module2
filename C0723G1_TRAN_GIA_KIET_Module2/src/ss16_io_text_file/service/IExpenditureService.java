package ss16_io_text_file.service;

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
