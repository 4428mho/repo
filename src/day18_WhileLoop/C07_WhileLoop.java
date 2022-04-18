package day18_WhileLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {

        int sayiMiktari=5;
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        for (int i = 1; i <=sayiMiktari ; i++) {
            System.out.println("lütfenbir sayı giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("girilen "+sayiMiktari+ " sayinin toplami = "+toplam);


        sayi=0;
        toplam=0;
        int sayac=1;
        while (sayac<=sayiMiktari){
            System.out.println("lütfenbir sayı giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;
            System.out.println("girilen "+sayiMiktari+ " sayinin toplami = "+toplam);

        }

    }
}
