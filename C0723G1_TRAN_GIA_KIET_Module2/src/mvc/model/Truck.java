package mvc.model;

public class Truck extends Vehicle {
    private String tonnage;

    public Truck(int numberPlate, String nameTheFirm, String yearOfManufacture, String owner, String tonnage) {
        super(numberPlate, nameTheFirm, yearOfManufacture, owner);
        this.tonnage = tonnage;
    }

    public String getTonnage() {
        return tonnage;
    }

    public void setTonnage(String tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Tải trọng : " + tonnage + '\n';
    }
}
