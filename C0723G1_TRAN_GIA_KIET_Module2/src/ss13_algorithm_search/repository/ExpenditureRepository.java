package ss13_algorithm_search.repository;

import ss13_algorithm_search.model.Expenditure;

import java.util.ArrayList;
import java.util.List;

public class ExpenditureRepository implements IExpenditureRepository {
    private static List<Expenditure> expenditureList = new ArrayList<>();

    static {
        expenditureList.add(new Expenditure(1, "Mua điện thoại", "23/09/2003",
                100, "iphone 15"));
        expenditureList.add(new Expenditure(2, "Mua xe", "23/09/2035",
                10000, "Lexus "));
    }

    @Override
    public List<Expenditure> display() {
        return expenditureList;
    }

    @Override
    public void add(Expenditure expenditure) {
        expenditureList.add(expenditure);
    }

    @Override
    public boolean delete(int id) {
        for (Expenditure expenditure : expenditureList) {
            if (expenditure.getId() == id) {
                expenditureList.remove(expenditure);
                return true;
            }
        }
        return false;
    }

    @Override
    public void edit(int id, Expenditure expenditure) {
        for (int i = 0; i < expenditureList.size(); i++) {
            if (id == expenditureList.get(i).getId()) {
                expenditureList.get(i).setName(expenditure.getName());
                expenditureList.get(i).setDate(expenditure.getDate());
                expenditureList.get(i).setPrice(expenditure.getPrice());
                expenditureList.get(i).setDescribe(expenditure.getDescribe());
            }
        }
    }

    @Override
    public  List<Expenditure> searchById(int id) {
        List<Expenditure> result = new ArrayList<>();
        for (Expenditure expenditure : expenditureList) {
            if (expenditure.getId() == id) {
                result.add(expenditure);
            }
        }
        return result;
    }

    @Override
    public List<Expenditure> searchByName(String name) {
        List<Expenditure> result = new ArrayList<>();
        for (Expenditure expenditure : expenditureList) {
            if (expenditure.getName().contains(name)) {
                result.add(expenditure);
            }
        }
        return result;
    }

    public boolean checkId(int id) {
        for (Expenditure expenditure : expenditureList) {
            if (expenditure.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
