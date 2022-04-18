package day16_methodCreation;

public class C03_Overloading {
    public static void main(String[] args) {

       toplam(1.46,45);
    }private static void toplam(double a, int b) {

        System.out.println("toplam = " + (a + b));
    }
    private static void toplam(double a, double b) {
        System.out.println("toplam = " +(a+b));
    }
    private static void toplam(int sayi1, int sayi2) {
        System.out.println("iki sayi toplami = " + (sayi1+sayi2));
    }
    private static void toplam(int x, double y) {
        System.out.println("toplam = " +(x+y));
    }
}
