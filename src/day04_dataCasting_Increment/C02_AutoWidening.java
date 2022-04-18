package day04_dataCasting_Increment;

public class C02_AutoWidening {
    public static void main(String[] args) {
        byte sayi1=44;
        System.out.println(sayi1);
        short sayi2=sayi1;
        System.out.println(sayi2);
        double sayi3 =sayi2;
        System.out.println(sayi3);

        int num1 = 12;

        int num2 = 15;

        num1*=2;

        num2/=3;

        System.out.println(num1 + num2);
    }
}
