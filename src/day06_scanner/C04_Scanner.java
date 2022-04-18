package day06_scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen İsminizi Giriniz");

        String kullaniciIsmi= scan.nextLine();
        System.out.println("Kullanicinin Girdigi Isim: "+kullaniciIsmi);
    }
}
