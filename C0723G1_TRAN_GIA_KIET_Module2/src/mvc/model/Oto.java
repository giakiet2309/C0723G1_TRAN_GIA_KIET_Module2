package mvc.model;

public class Oto extends Vehicle {
    private String numberOfSeats;
    private String carType;

    public Oto(int numberPlate, String nameTheFirm, String yearOfManufacture, String owner, String numberOfSeats, String carType) {
        super(numberPlate, nameTheFirm, yearOfManufacture, owner);
        this.numberOfSeats = numberOfSeats;
        this.carType = carType;
    }

    public String getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(String numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Số ghế ngồi : " + numberOfSeats + '\n' +
                "Kiểu xe : " + carType + '\n';
    }
}
