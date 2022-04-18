package day14_stringManipulation;

public class Q01_trim {
    public static void main(String[] args) {
        String str="        siz ne derseniz deyin java bildiğini okur.     ";
        str.trim();
        str=str.trim();
        System.out.println(str.length());
        str=str.trim();
        System.out.println(str.length());



    }
}
