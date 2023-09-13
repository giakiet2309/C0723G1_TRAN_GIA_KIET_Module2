package ss08_cleancode_refactoring;


public class CleanCode {
    public int sum(int number1, int number2, int number3) {
        int total = number1 + number2 + number3;
        return total;
    }

    private void employeeDetails(Employee employee) {
    }

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public void getDayOfMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month + " Có 31 ngày ");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month + " Có 30 ngày ");
                break;
            case 2:
                if (isLeapYear(year)) {
                    System.out.println("Tháng 2 có 29 ngày ");
                    break;
                } else {
                    System.out.println("Tháng 2 có 28 ngày ");
                    break;
                }
            default:
                System.out.println("Tháng " + month + " Không hợp lệ");
        }
    }
}