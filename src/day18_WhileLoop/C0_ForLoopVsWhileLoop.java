package day18_WhileLoop;

import java.util.Scanner;

public class C0_ForLoopVsWhileLoop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        for (int i = 1; i <=100000000 ; i++) {
            System.out.println("lütfenbir sayı giriniz");
            sayi=scan.nextInt();
            if (sayi==0){break;}
            else {
                toplam+=sayi;
            }
    }
        System.out.println("toplam = " + toplam);
        
        sayi=1;
        toplam=0;
        while (sayi!=0){System.out.println("lütfenbir sayı giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("toplam = " + toplam);
}}
