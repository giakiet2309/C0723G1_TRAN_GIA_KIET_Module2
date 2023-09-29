package case_study.utils;

import java.time.Period;
import java.util.regex.Pattern;

public class Regex {
    private static boolean checkCode(String regex, String text) {
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(text).matches();
    }

    private static String isMale = "^Nam$|^Nữ$";
    private static String email = "^.+@.+\\.com\\.?";

    private static String educationCustomer = "^Diamond$|^Platinum$|^Gold$|^Silver$|^Member$";
    private static String education = "^Trung Cấp$|^Cao Đẳng$|^Đại Học$|^Sau Đại Học$";
    private static String employeeType = "^Lễ Tân$|^Phục Vụ$|^Chuyên Viên$|^Giám Sát$|^Quản Lý$|^Giám Đốc$";

    public static boolean validateEmployeeId(String id) {
        Pattern pattern = Pattern.compile("^NV-[0-9]{4}$");
        return pattern.matcher(id).matches();
    }

    public static boolean validateCustomerId(String id) {
        Pattern pattern = Pattern.compile("^KH-[0-9]{4}$");
        return pattern.matcher(id).matches();
    }

    public static boolean validateVillaId(String id) {
        Pattern pattern = Pattern.compile("^SVVL-[0-9]{4}$");
        return pattern.matcher(id).matches();
    }

    public static boolean validateHouseId(String id) {
        Pattern pattern = Pattern.compile("^SVHO-[0-9]{4}$");
        return pattern.matcher(id).matches();
    }

    public static boolean validateRoomId(String id) {
        Pattern pattern = Pattern.compile("^SVRO-[0-9]{4}$");
        return pattern.matcher(id).matches();
    }

    public static boolean validateIdentNumber(String id) {
        Pattern pattern1 = Pattern.compile("^[0-9]{9}$");
        Pattern pattern2 = Pattern.compile("^[0-9]{12}$");
        return pattern1.matcher(id).matches() || pattern2.matcher(id).matches();
    }

    public static boolean validatePhoneNumber(String id) {
        Pattern pattern = Pattern.compile("^0[0-9]{9}$");
        return pattern.matcher(id).matches();
    }

    public static boolean checkIsMale(String text) {
        return checkCode(isMale, text);
    }

    public static boolean checkEmail(String text) {
        return checkCode(email, text);
    }

    public static boolean checkEducation(String text) {
        return checkCode(education, text);
    }
    public static boolean checkEducationCustomer(String text) {
        return checkCode(educationCustomer, text);
    }

    public static boolean checkEmployeeType(String text) {
        return checkCode(employeeType, text);
    }

}
