package ss16_io_text_file.repository;

import ss16_io_text_file.model.Expenditure;

import java.util.List;

public interface IExpenditureRepository {
    List<Expenditure> display();

    void add(Expenditure expenditure);

    boolean delete(int id);

    void edit(int id, Expenditure expenditure);

    List<Expenditure> searchById(int id);

    List<Expenditure> searchByName(String name);

    List<Expenditure> sortByNameAscending();

    List<Expenditure> sortByPriceDecrease();
}
