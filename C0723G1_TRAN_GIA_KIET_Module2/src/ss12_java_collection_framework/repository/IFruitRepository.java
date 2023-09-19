package ss12_java_collection_framework.repository;

import ss12_java_collection_framework.model.Fruit;

import java.util.List;
import java.util.Map;

public interface IFruitRepository {
    void addFruit(String key, Fruit fruit);

    Map<String, Fruit> display();

    void removeFruit(String key);

    void editFruit(String key, Fruit fruit);

    boolean checkKey(String key);
}
