package day16_methodCreation;

public class C04_ForLoop {
    public static void main(String[] args) {
        String isim="gkgkjhkgxzcnvkldfgkdfjhgkadhfkhhgafghhgfdjhdf";


        for (int i = isim.length()-1; i>=0 ; i--) {
            System.out.print(isim.substring(i,i+1));


        }
    }
}
