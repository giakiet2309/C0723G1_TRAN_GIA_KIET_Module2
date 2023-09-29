package case_study.model.person;

public class Customer extends Person {
    private String typeOfCustomer;
    private String address;

    public Customer(String id, String name, String date, String gender,
                    String citizenId, String telephone, String email,
                    String typeOfCustomer, String address) {
        super(id, name, date, gender, citizenId, telephone, email);
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() +
                " - Loại khách : " + typeOfCustomer + '\n' +
                " - Địa chỉ : " + address + '\n';
    }
}
