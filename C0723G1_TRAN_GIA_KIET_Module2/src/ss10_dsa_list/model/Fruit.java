package ss10_dsa_list.model;

public class Fruit {
    private String nameFruit;
    private String typesFruit;
    private String manufacturingDate;
    private String outOfDate;
    private String origin;
    private String price;

    public Fruit(String nameFruit, String typesFruit, String manufacturingDate,
                 String outOfDate, String origin, String price) {
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "Tên hoa quả : " + nameFruit + '\n' +
                "Kiểu hoa quả : " + typesFruit + '\n' +
                "Ngày sản xuất : " + manufacturingDate + '\n' +
                "Hạn sử dụng : " + outOfDate + '\n' +
                "Xuất xứ : " + origin + '\n' +
                "Giá : " + price + "Đ" +'\n';
    }
}
