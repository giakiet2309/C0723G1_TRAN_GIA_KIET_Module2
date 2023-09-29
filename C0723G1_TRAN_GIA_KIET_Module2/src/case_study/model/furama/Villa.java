package case_study.model.furama;

public class Villa extends Facility {
    private String roomstandard;
    private String areaOfPool;
    private String numOffLoors;

    public Villa() {

    }

    public Villa(String serviceCode, String serviceName, Double area, Double price, int capacity, String rentType, String roomstandard, String areaOfPool, String numOffLoors) {
        super(serviceCode, serviceName, area, price, capacity, rentType);
        this.roomstandard = roomstandard;
        this.areaOfPool = areaOfPool;
        this.numOffLoors = numOffLoors;
    }

    public String getRoomstandard() {
        return roomstandard;
    }

    public void setRoomstandard(String roomstandard) {
        this.roomstandard = roomstandard;
    }

    public String getAreaOfPool() {
        return areaOfPool;
    }

    public void setAreaOfPool(String areaOfPool) {
        this.areaOfPool = areaOfPool;
    }

    public String getNumOffLoors() {
        return numOffLoors;
    }

    public void setNumOffLoors(String numOffLoors) {
        this.numOffLoors = numOffLoors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomstandard='" + roomstandard + '\'' +
                ", areaOfPool='" + areaOfPool + '\'' +
                ", numOffLoors='" + numOffLoors + '\'' +
                '}';
    }
}
