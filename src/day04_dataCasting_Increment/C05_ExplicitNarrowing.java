package day04_dataCasting_Increment;

public class C05_ExplicitNarrowing {
    public static void main(String[] args) {
        int sayi5=140;
        byte sayi6=(byte) sayi5;
        System.out.println(sayi6);

        sayi5=520;
        sayi6=(byte) sayi5;
        System.out.println(sayi6);
        sayi5=826;
        sayi6=(byte) sayi5;
        System.out.println(sayi6);
        sayi5=55;
        sayi6=(byte) sayi5;
        System.out.println(sayi6);

        double sayi1 = 18.934;

        int sayi2 = (int)sayi1;



        System.out.println(sayi2);
    }
}
