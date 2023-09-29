package case_study.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Validator {

    public static boolean validateName(String name) {
        String[] parts = name.split(" ");
        if (parts.length < 2) {
            return false;
        }
        for (String part : parts) {
            if (part.length() < 1) {
                return false;
            }
        }
        for (String part : parts) {
            if (!Character.isUpperCase(part.charAt(0))) {
                return false;
            }
        }
        return true;
    }

    public static boolean validateAge(String dobString) {
        DateTimeFormatter dateTimeException = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dob = LocalDate.parse(dobString, dateTimeException);
        LocalDate today = LocalDate.now();
        Period period = Period.between(dob, today);
        return period.getYears() >= 18;
    }


}
