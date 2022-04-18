package day11_StringManipulation;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {
    public static void main(String[] args) {
        String str ="java guzeldirğ";
        System.out.println(str.toUpperCase().charAt(5));
        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));

    }
}
