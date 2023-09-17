package mvc.repository.truck;

import mvc.model.Firm;
import mvc.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckRepository implements ITruckRepository {
    private static List<Firm> firmList = new ArrayList<>();

    static {
        firmList.add(new Firm("1", "VinPhat", "VN"));
        firmList.add(new Firm("2", "Mẹc", "Lào"));
        firmList.add(new Firm("3", "XeBò", "CamPuChia"));
    }

    private static String getName(int number) {
        return firmList.get(number).getName();
    }

    private static List<Truck> truckList = new ArrayList<>();
    private static List<Truck> newTruckList = new ArrayList<>();

    static {
        truckList.add(new Truck(1, "Mẹc", "2003",
                "Kiet", "1000kg"));
        truckList.add(new Truck(2, "Xe Bò", "2023",
                "ciet", "100kg"));
    }

    @Override
    public void addTruck(Truck truck) {
        truckList.add(truck);
    }

    @Override
    public List<Truck> showTruck() {
        return truckList;
    }

    @Override
    public boolean delTruck(int id) {
        for (Truck truck : truckList) {
            if (truck.getNumberPlate() == id) {
                truckList.remove(truck);
                return true;
            }
        }
        return false;
    }

    public boolean checkIdTruck(int id) {
        for (Truck truck : truckList) {
            if (truck.getNumberPlate() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Truck searchTruck(int id) {
        for (Truck truck : truckList) {
            if (truck.getNumberPlate() == id) {
                return truck;
            }
        }
        return null;
    }


}
