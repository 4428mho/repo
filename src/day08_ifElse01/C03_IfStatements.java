package day08_ifElse01;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen Bir Tamsayı Giriniz");
        int sayi= scan.nextInt();
        if (sayi%2  == 0){
            System.out.println("Girilen Sayı Çift");
        }
        if (sayi%2!=0){
            System.out.println("girilen satı tek");
        }
    }
}
