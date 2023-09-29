package case_study.repository;

import java.util.List;

public interface IFurameRepo<E>{

    void add(E e);

    boolean delete(String id);

    List<E> display();
}
