package ss13_algorithm_search.repository;

import ss13_algorithm_search.model.Expenditure;

import java.util.List;

public interface IExpenditureRepository {
    List<Expenditure> display();

    void add(Expenditure expenditure);

    boolean delete(int id);

    void edit(int id , Expenditure expenditure);

    List<Expenditure> searchById(int id);

    List<Expenditure> searchByName(String name);
}
