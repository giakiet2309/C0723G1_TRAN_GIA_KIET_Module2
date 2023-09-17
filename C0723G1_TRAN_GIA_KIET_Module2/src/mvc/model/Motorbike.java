package mvc.model;

public class Motorbike extends Vehicle{
    private String wattage;

    public Motorbike(int numberPlate, String nameTheFirm, String yearOfManufacture, String owner, String wattage) {
        super(numberPlate, nameTheFirm, yearOfManufacture, owner);
        this.wattage = wattage;
    }

    public String getWattage() {
        return wattage;
    }

    public void setWattage(String wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return super.toString() +
                "wattage='" + wattage + '\'' ;

    }
}
