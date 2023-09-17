package mvc.model;

public abstract class Vehicle {
    private int numberPlate;
    private String nameTheFirm;
    private String yearOfManufacture;
    private String owner;

    public int getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(int numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getNameTheFirm() {
        return nameTheFirm;
    }

    public void setNameTheFirm(String nameTheFirm) {
        this.nameTheFirm = nameTheFirm;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Vehicle(int numberPlate, String nameTheFirm,
                   String yearOfManufacture, String owner) {
        this.numberPlate = numberPlate;
        this.nameTheFirm = nameTheFirm;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return
                "Biển sổ : " + numberPlate + '\n' +
                "Hãng sản xuất : " + nameTheFirm + '\n' +
                "Năm sản xuất : " + yearOfManufacture + '\n' +
                "Chủ sở hữu : " + owner + "\n" ;

    }
}
