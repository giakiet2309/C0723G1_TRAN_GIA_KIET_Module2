package ss10_dsa_list.repository;

import ss10_dsa_list.model.Fruit;

import java.util.ArrayList;
import java.util.List;

public class FruitRepository implements IFruitRepository{
    private static List<Fruit> fruitList = new ArrayList<>();
    static {
        fruitList.add(new Fruit("Táo", "Ăn quả",
                "23/08/2022", "23/09/2023", "Vietnam", "23"));
        fruitList.add(new Fruit("Chuối", "Ăn quả",
                "23/08/2022", "21/03/2023", "Lào", "8"));
        fruitList.add(new Fruit("Nho", "Ăn quả",
                "12/09/2023", "20/04/2023", "Mỹ", "87"));
    }

    @Override
    public void addFruit(Fruit fruit) {
        fruitList.add(fruit);
    }

    @Override
    public List<Fruit> display() {
        return fruitList;
    }
}
