package case_study.model.furama;

public class Room extends Facility {
    private String serviceFree;

    public Room() {
    }

    public Room(String serviceCode, String serviceName, Double area, Double price, int capacity, String rentType, String serviceFree) {
        super(serviceCode, serviceName, area, price, capacity, rentType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return "Room{" +
                "serviceFree='" + serviceFree + '\'' +
                '}';
    }
}