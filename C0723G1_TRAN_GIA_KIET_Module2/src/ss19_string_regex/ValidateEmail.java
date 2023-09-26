package ss19_string_regex;


public class ValidateEmail {
    private static final String EMAIL = "^\\w{6,32}@\\w{2,12}\\.\\w{2,12}";
    public static void main(String[] args) {
        String test1 = "NguyenVanA2000@gmail.com";
        String test2 = "Nguy_enV_anA_2000@gmail.com";
        String test3 = "Nguye@gmail.com";
        String test4 = "NguyenVanA2000@g.com";
        String test5 = "NguyenVanA2000@gmail.c";
        String test6 = "NguyenVanAgmail.com";
        System.out.print(test1 + " : ");
        checkRegex(test1);
        System.out.print(test2 + " : ");
        checkRegex(test2);
        System.out.print(test3 + " : ");
        checkRegex(test3);
        System.out.print(test4 + " : ");
        checkRegex(test4);
        System.out.print(test5 + " : ");
        checkRegex(test5);
        System.out.print(test6 + " : ");
        checkRegex(test6);
    }
    public static void checkRegex(String str) {
        if (str.matches(EMAIL)) {
            System.out.println("Gmail hợp lệ");
        } else {
            System.out.println("Gmail không hợp lệ");
        }
    }
}
