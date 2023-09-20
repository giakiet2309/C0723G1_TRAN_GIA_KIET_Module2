package check;



import java.util.LinkedList;

public class LongesetContinueString {
    public static void main(String[] args) {
        String str = "abcabcdgabmnsxyabmnsxy";
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> temp = new LinkedList<>();
            temp.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > temp.getLast()) {
                    temp.add(str.charAt(j));
                } else {
                    break;
                }
            }
            System.out.println(temp);
            if (temp.size() > max.size()) {
                max.clear();
                max.addAll(temp);
            }
        }
        System.out.println("Kết quả là: ");
        for (char ch : max) {
            System.out.print(ch);
        }
    }
}
