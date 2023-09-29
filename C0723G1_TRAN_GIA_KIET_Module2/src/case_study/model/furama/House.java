package case_study.model.furama;

public class House extends Facility {
    private String roomstandard;
    private String numOffLoors;

    public House() {

    }

    public House(String serviceCode, String serviceName, Double area, Double price, int capacity, String rentType, String roomstandard, String numOffLoors) {
        super(serviceCode, serviceName, area, price, capacity, rentType);
        this.roomstandard = roomstandard;
        this.numOffLoors = numOffLoors;
    }

    public String getRoomstandard() {
        return roomstandard;
    }

    public void setRoomstandard(String roomstandard) {
        this.roomstandard = roomstandard;
    }

    public String getNumOffLoors() {
        return numOffLoors;
    }

    public void setNumOffLoors(String numOffLoors) {
        this.numOffLoors = numOffLoors;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomstandard='" + roomstandard + '\'' +
                ", numOffLoors='" + numOffLoors + '\'' +
                '}';
    }
}
