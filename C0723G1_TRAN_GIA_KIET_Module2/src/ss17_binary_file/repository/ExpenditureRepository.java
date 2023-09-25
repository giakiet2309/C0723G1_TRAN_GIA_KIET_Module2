package ss17_binary_file.repository;

import ss17_binary_file.model.Expenditure;
import ss17_binary_file.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExpenditureRepository implements IExpenditureRepository {
    private static final String FILE_PATCH = "C:\\Users\\Gia Kiet\\Desktop\\module 2\\C0723G1_TRAN_GIA_KIET_Module2" +
            "\\C0723G1_TRAN_GIA_KIET_Module2\\src\\ss17_binary_file\\data\\data.dat";


    @Override
    public List<Expenditure> display() {
        List<Expenditure> expenditures = ReadAndWrite.readFile(FILE_PATCH);
        return expenditures;
    }


    @Override
    public void add(Expenditure expenditure) {
        List<Expenditure> expenditureList = this.display();
        expenditureList.add(expenditure);
        ReadAndWrite.writeFile(FILE_PATCH, expenditureList);
    }

    @Override
    public boolean delete(int id) {
        List<Expenditure> expenditureList = this.display();
        for (Expenditure expenditure : expenditureList) {
            if (expenditure.getId() == id) {
                expenditureList.remove(expenditure);
                ReadAndWrite.writeFile(FILE_PATCH, expenditureList);
                return true;
            }
        }
        return false;
    }

    @Override
    public void edit(int id, Expenditure expenditure) {
        List<Expenditure> expenditureList = this.display();
        for (int i = 0; i < expenditureList.size(); i++) {
            if (id == expenditureList.get(i).getId()) {
                expenditureList.get(i).setName(expenditure.getName());
                expenditureList.get(i).setDate(expenditure.getDate());
                expenditureList.get(i).setPrice(expenditure.getPrice());
                expenditureList.get(i).setDescribe(expenditure.getDescribe());
                ReadAndWrite.writeFile(FILE_PATCH, expenditureList);
            }
        }
    }

    @Override
    public List<Expenditure> searchById(int id) {
        List<Expenditure> result = new ArrayList<>();
        for (Expenditure expenditure : this.display()) {
            if (expenditure.getId() == id) {
                result.add(expenditure);
            }
        }
        return result;
    }

    @Override
    public List<Expenditure> searchByName(String name) {
        List<Expenditure> result = new ArrayList<>();
        for (Expenditure expenditure : this.display()) {
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
}
