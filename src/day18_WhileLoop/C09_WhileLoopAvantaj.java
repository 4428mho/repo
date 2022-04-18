package day18_WhileLoop;

import java.util.Scanner;

public class C09_WhileLoopAvantaj {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        while (toplam<500){
            System.out.println("lütfenbir sayı giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("bese " +toplam+ " eri");
    }
}
