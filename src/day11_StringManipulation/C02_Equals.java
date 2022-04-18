package day11_StringManipulation;

public class C02_Equals {
    public static void main(String[] args) {
        String str1="Ali Can";
        String str2="Ali"+" Can";
        String str3= str1+"";
        System.out.println("str3: " + str3);
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        System.out.println("== ile karsılastır : "+ (str1==str2));
        System.out.println("equals ile karsılastır : "+ str1.equals(str2));
        System.out.println("== ile karsılastır : "+ (str3==str2));
        System.out.println("equals ile karsılastır : "+ str3.equals(str2));
        String str5="muhammet";
        String str6="MUHAMMET";
        System.out.println(str5.toUpperCase().equals(str6));
    }
}
