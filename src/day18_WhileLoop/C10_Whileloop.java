package day18_WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class C10_Whileloop {
    public static void main(String[] args) {
        Random rnd=new Random();
        int sayi=rnd.nextInt(100);
        System.out.println("sayi = " + sayi);
        Scanner scan=new Scanner(System.in);

        int tahmin=0;
        int sayac=1;
        while (sayi!=tahmin){
            System.out.println("tahminde bulun");
            tahmin=scan.nextInt();
            if (tahmin>sayi){
                System.out.println("daha küçük bir sayı söyle");
                sayac++;
            }else if (tahmin<sayi){
                System.out.println("daha büyük bir sayı söyle");
                sayac++;
            }
        }
        System.out.println((sayac)+" tahminde buldun");
    }
}
