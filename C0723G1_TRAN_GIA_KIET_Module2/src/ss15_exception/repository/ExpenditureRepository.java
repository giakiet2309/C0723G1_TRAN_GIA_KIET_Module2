package ss15_exception.repository;

import ss15_exception.model.Expenditure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExpenditureRepository implements IExpenditureRepository {
    private static List<Expenditure> expenditureList = new ArrayList<>();

    static {
        expenditureList.add(new Expenditure(1, "a", "23/09/2003",
                100, "iphone 15"));
        expenditureList.add(new Expenditure(2, "b", "23/09/2035",
                200, "Lexus "));
        expenditureList.add(new Expenditure(3, "c", "23/09/2035",
                300, "Lexus "));
        expenditureList.add(new Expenditure(4, "d", "23/09/2035",
                500, "Lexus "));
        expenditureList.add(new Expenditure(5, "e ", "23/09/2035",
                400, "Lexus "));
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
    public List<Expenditure> searchById(int id) {
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

    @Override
    public List<Expenditure> sortByNameAscending() {
        List<Expenditure> expenditures = display();
        Collections.sort(
                expenditures, new Comparator<Expenditure>() {
                    @Override
                    public int compare(Expenditure o1, Expenditure o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                }
        );
        return expenditures;
    }

    @Override
    public List<Expenditure> sortByPriceDecrease() {
        List<Expenditure> expenditures = display();
        Collections.sort(expenditures, new Comparator<Expenditure>() {
            @Override
            public int compare(Expenditure o1, Expenditure o2) {
                if (o1.getPrice() == o2.getPrice()) {
                    return o1.getName().compareTo(o2.getName());
                } else {
                    if (o1.getPrice() < o2.getPrice()) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            }
        });
        return expenditures;
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
