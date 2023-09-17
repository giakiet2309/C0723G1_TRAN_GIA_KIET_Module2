package mvc.repository.truck;

import mvc.model.Truck;

import java.util.List;

public interface ITruckRepository {
    void addTruck(Truck truck);

    List<Truck> showTruck();

    boolean delTruck(int id);

    Truck searchTruck(int id);
}
