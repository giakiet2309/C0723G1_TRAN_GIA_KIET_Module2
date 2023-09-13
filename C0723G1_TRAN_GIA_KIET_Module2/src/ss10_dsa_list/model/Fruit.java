package ss10_dsa_list.model;

public class Fruit {
    private String nameFruit;
    private String typesFruit;
    private String manufacturingDate;
    private String outOfDate;
    private String origin;
    private Double price;

    public Fruit(String nameFruit, String typesFruit, String manufacturingDate, String outOfDate, String origin, Double price) {
        this.nameFruit = nameFruit;
        this.typesFruit = typesFruit;
        this.manufacturingDate = manufacturingDate;
        this.outOfDate = outOfDate;
        this.origin = origin;
        this.price = price;
    }

    public String getNameFruit() {
        return nameFruit;
    }

    public void setNameFruit(String nameFruit) {
        this.nameFruit = nameFruit;
    }

    public String getTypesFruit() {
        return typesFruit;
    }

    public void setTypesFruit(String typesFruit) {
        this.typesFruit = typesFruit;
    }

    public String getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getOutOfDate() {
        return outOfDate;
    }

    public void setOutOfDate(String outOfDate) {
        this.outOfDate = outOfDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "nameFruit='" + nameFruit + '\'' +
                ", typesFruit='" + typesFruit + '\'' +
                ", manufacturingDate='" + manufacturingDate + '\'' +
                ", outOfDate='" + outOfDate + '\'' +
                ", origin='" + origin + '\'' +
                ", price=" + price +
                '}';
    }
}
