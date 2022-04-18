package day09_ifElseIfStatements;

import java.util.Scanner;

public class C02_NotuHarfeCevirme {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen 100 üzerinden aldgınız notu giriniz");
        double not=scan.nextDouble();
        if (not<0 || not > 100){
            System.out.println("geçerli bir not giriniz");
        }
        else if (not>80){
            System.out.println("Harf notunuz= A");
        }
        else if (not>=60){
            System.out.println("Harf notunuz = B");
        }
        else if (not>=50){
            System.out.println("Harf notunuz = c");
        }
        else {
            System.out.println("Harf notunuz = D");
        }
    }
}
