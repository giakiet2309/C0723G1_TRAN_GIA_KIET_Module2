package ss16_io_text_file.model;

public class Expenditure {
    private int id;

    private String name;

    private String date;

    private int price;

    private String describe;

    public Expenditure(int id, String name, String date, int price, String describe) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.price = price;
        this.describe = describe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return
                "Mã chi tiêu : " + id + '\n' +
                        "Tên chi tiêu : " + name + '\n' +
                        "Ngày chi :" + date + '\n' +
                        "Số tiền chi : " + price + '\n' +
                        "Mô tả : " + describe + '\n';
    }
}
