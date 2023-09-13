package ss08_cleancode_refactoring;

import java.util.List;

public class Employee {
    private String name;
    private String age;
    private String awards;
    private String ctc;
    private String experienceYears;

    public Employee(String name, String age, String awards, String ctc, String experienceYears) {
        this.name = name;
        this.age = age;
        this.awards = awards;
        this.ctc = ctc;
        this.experienceYears = experienceYears;
    }
}
