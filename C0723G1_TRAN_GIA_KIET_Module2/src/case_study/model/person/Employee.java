package case_study.model.person;

public class Employee extends Person {
    private String educationLevel;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, String date, String gender, String citizenId, String telephone, String email, String educationLevel, String position, double salary) {
        super(id, name, date, gender, citizenId, telephone, email);
        this.educationLevel = educationLevel;
        this.position = position;
        this.salary = salary;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                " - Trình độ :" + educationLevel + '\n' +
                " - Chức vụ : " + position + '\n' +
                " - Lương :" + salary + "\n";
    }
}