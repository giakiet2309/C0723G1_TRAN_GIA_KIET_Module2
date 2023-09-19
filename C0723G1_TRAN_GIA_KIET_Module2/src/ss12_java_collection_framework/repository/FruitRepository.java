package ss12_java_collection_framework.repository;

import ss12_java_collection_framework.model.Fruit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FruitRepository implements IFruitRepository {
    private static Map<String, Fruit> fruitList = new HashMap<>();

    static {
        fruitList.put("1", new Fruit("Táo", "Ăn quả",
                "23/08/2022", "23/09/2023", "Vietnam", "23"));
        fruitList.put("2", new Fruit("Chuối", "Ăn quả",
                "23/08/2022", "21/03/2023", "Lào", "8"));
        fruitList.put("3", new Fruit("Nho", "Ăn quả",
                "12/09/2023", "20/04/2023", "Mỹ", "87"));
    }

    @Override
    public void addFruit(String key, Fruit fruit) {
        fruitList.put(key, fruit);
    }

    @Override
    public Map<String, Fruit> display() {
        return fruitList;
    }

//

    @Override
    public void removeFruit(String key) {
        fruitList.remove(key);
    }

    @Override
    public void editFruit(String key, Fruit fruit) {
        fruitList.put(key,fruit);
    }

    @Override
    public boolean checkKey(String key) {
        for (String keys : fruitList.keySet()) {
            if (keys.equals(key)) {
                return true;
            }
        }
        return false;
    }

}
