package day07_matematikselislemler;

import java.util.Scanner;

public class C03_MatIslem {

    public static void main(String[] args) {
       int a=15 % 4;
        System.out.println(a);

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamaklı bir tamsayı giriniz");
        int sayi=scan.nextInt();


        int rakam=0;
        int rakamlarToplami=0;



        rakam=sayi%10;
        rakamlarToplami +=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami +=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami +=rakam;
        sayi/=10;

     System.out.println("girdiginiz sayinin rakamlar toplami " + rakamlarToplami);




    }
}
