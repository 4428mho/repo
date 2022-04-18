package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {
        String str="Java ile IT cok guzel";
        System.out.println(str.substring(5));
        System.out.println(str.replace("Java","aynur"));
        System.out.println("aynur "+str.substring(5));
        System.out.println(str.substring(9));
        System.out.println(str.substring(3,9));
        System.out.println(str.substring(6,6));
        System.out.println(str.substring(str.length()-5));
        System.out.println(str.substring(str.length()));

    }
}
