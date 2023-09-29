package case_study.model.furama;

public abstract class Facility {
    private String serviceCode;
    private String serviceName;
    private Double area;
    private Double price;
    private int capacity;
    private String rentType;

    public Facility() {
    }

    public Facility(String serviceCode, String serviceName, Double area, Double price, int capacity, String rentType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.area = area;
        this.price = price;
        this.capacity = capacity;
        this.rentType = rentType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceCode='" + serviceCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", capacity=" + capacity +
                ", rentType='" + rentType + '\'' +
                '}';
    }
}
