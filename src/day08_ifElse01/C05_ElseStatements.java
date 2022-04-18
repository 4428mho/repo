package day08_ifElse01;

import java.util.Scanner;

public class C05_ElseStatements {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        if (a>=b){
            System.out.println(a+b);
        }
        else {
            System.out.println(a*b);
        }
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen Bir Tamsayı Giriniz");
        int sayi= scan.nextInt();
        if (sayi%2  == 0){
            System.out.println("Girilen Sayı Çift");
        }
        else {
            System.out.println("Girilen Sayı Tek");
        }
    }

}
