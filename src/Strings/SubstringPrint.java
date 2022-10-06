package Strings;

public class SubstringPrint {
    public static void main(String[] args) {
        String s = "Estonia is a beautiful country";
        System.out.println(s);

        System.out.println(s.substring(0,13));
        System.out.println(s.substring(23));
        System.out.println(s.substring(13,22));
        System.out.println(s.substring(0,11)+ s.substring(23));

        System.out.println(s.substring(s.indexOf("beaut")));

        System.out.println(s.startsWith("Est"));
    }
}
