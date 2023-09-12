package ss08_cleancode_refactoring;


public class CleanCode {
    public int sum(int number1, int number2, int number3) {
        int sum = number1 + number2 + number3;
        return sum;
    }

    private void employeeDetails(String name, String age, String awards, String ctc, String experience) {
        // Do something 
    }

    public boolean is_leap_year(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public int getDayOfMonth(int month, int year) {
        switch (month) {
            case 1:
                return 31;
            case 3:
                return 31;
            case 5:
                return 31;
            case 7:
                return 31;
            case 8:
                return 31;
            case 10:
                return 31;
            case 12:
                return 31;
            case 4:
                return 30;
            case 6:
                return 30;
            case 9:
                return 30;
            case 11:
                return 30;
            case 2:
                return is_leap_year(year) ? 29 : 28;
            default:
                return -1;
        }
    }
}