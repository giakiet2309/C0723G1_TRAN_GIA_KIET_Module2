package case_study.model.person;


import java.time.LocalDate;

public abstract class Person {
    private String id;
    private String name;
    private String date;
    private String gender;
    private String citizenId;
    private String telephone;
    private String email;

    public Person() {
    }

    public Person(String id, String name, String date, String gender, String citizenId, String telephone, String email) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.citizenId = citizenId;
        this.telephone = telephone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(String citizenId) {
        this.citizenId = citizenId;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID : " + id + " - " + name + "\n" +
                " - Căn cước công dân : " + citizenId + "\n" +
                " - Giới tính : " + gender + "\n" +
                " - Năm sinh : " + date + "\n" +
                " - Điện thoại : " + telephone + "\n" +
                " - Email : " + email + "\n";
    }
}
