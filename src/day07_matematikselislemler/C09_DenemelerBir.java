package day07_matematikselislemler;

import java.util.Scanner;

public class C09_DenemelerBir {

    public static <fit> void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Yasinizi giriniz");
        double Yas = scan.nextInt();
        System.out.println("boy degerini giriniz");
        double boy =scan.nextDouble();

        System.out.println("Kilo degerini  giriniz ");
        double Kilo= scan.nextDouble();
        double sonuc=Kilo/(boy*boy);
        System.out.println("boy kilo endeksiniz= "+sonuc);

        if (sonuc<30){
            System.out.println("zayıf");}
        else
        {
            System.out.println("obez");
        }












    }

}
