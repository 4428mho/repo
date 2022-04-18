package day11_StringManipulation;

public class C05_indexOf {
    public static void main(String[] args) {
        String str1="Java bir başka güzel";
        System.out.println(str1.indexOf('J'));
        System.out.println(str1.indexOf("aşka"));
        System.out.println(str1.indexOf("l"));
        System.out.println(str1.length()-1);
        System.out.println(str1.indexOf('b',5));

        int ilkindex=str1.indexOf('a');

        System.out.println(str1.indexOf('a',ilkindex+1));

        System.out.println(str1.indexOf("güzel",20));
        System.out.println(str1.indexOf("y"));
}}















