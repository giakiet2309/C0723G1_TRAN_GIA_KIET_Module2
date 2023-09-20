package check;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AscendingString {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi của bạn vào đây");
        str = scanner.nextLine();
        searchAscendingString(str);
    }

    public static String searchAscendingString(String str) {
//
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            Character character = str.charAt(i);
            String string = character + "";
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) >= character) {
                    string += str.charAt(j);
                    character = str.charAt(j);
                }
            }
            list.add(string);
        }
        int max = list.get(0).length();
        String result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i).length()) {
                max = list.get(i).length();
                result = list.get(i);
            }
        }
        System.out.println("chuoi tang dan dai nhat " + result);
        return result;
    }
}
