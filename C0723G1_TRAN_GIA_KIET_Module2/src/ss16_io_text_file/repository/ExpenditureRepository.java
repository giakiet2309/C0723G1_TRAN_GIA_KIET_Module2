package ss16_io_text_file.repository;

import ss16_io_text_file.model.Expenditure;
import ss16_io_text_file.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExpenditureRepository implements IExpenditureRepository {
    private static final String FILE_PATCH = "C:\\Users\\Gia Kiet\\Desktop\\module 2\\" +
            "C0723G1_TRAN_GIA_KIET_Module2\\C0723G1_TRAN_GIA_KIET_Module2\\src\\" +
            "ss16_io_text_file\\data\\data.csv";


    @Override
    public List<Expenditure> display() {
        List<Expenditure> expenditureList = new ArrayList<>();
        List<String> strings = ReadAndWrite.read(FILE_PATCH);
        String[] arrString = null;
        for (String p : strings) {
            arrString = p.split(",");
            expenditureList.add(new Expenditure(Integer.parseInt(arrString[0]), arrString[1]
                    , arrString[2], Integer.parseInt(arrString[3]), arrString[4]));
        }

        if (!expenditureList.isEmpty()) {
            return expenditureList;
        }
        return new ArrayList<>();
    }


    @Override
    public void add(Expenditure expenditure) {
        List<Expenditure> expenditureList = this.display();
        expenditureList.add(expenditure);
        List<String> strings = converToString(expenditureList);
        ReadAndWrite.write(FILE_PATCH, strings);
    }

    @Override
    public boolean delete(int id) {
        List<Expenditure> expenditureList = this.display();
        for (Expenditure expenditure : expenditureList) {
            if (expenditure.getId() == id) {
                expenditureList.remove(expenditure);

                List<String> strings = converToString(expenditureList);
                ReadAndWrite.write(FILE_PATCH, strings);
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

                List<String> stringList = converToString(expenditureList);
                ReadAndWrite.write(FILE_PATCH, stringList);
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

    public boolean checkId(int id) {
        for (Expenditure expenditure : this.display()) {
            if (expenditure.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static List<String> converToString(List<Expenditure> expenditureList) {
        List<String> stringList = new ArrayList<>();
        for (Expenditure expenditure : expenditureList) {
            stringList.add(expenditure.getId() + "," + expenditure.getName() + "," +
                    expenditure.getDate() + "," + expenditure.getPrice() +
                    "," + expenditure.getDescribe());
        }
        return stringList;
    }
}
