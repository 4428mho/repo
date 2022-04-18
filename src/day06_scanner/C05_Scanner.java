package day06_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Yarı Cap degeri Giriniz");
        double yaricap= scan.nextDouble();
        System.out.println("Girdiğiniz Yari Cap:" + yaricap);
        System.out.println("Cemberin Cevresi:" + 2*3.14*yaricap);
        System.out.println("Dairenin Alani:" + 3.14*yaricap*yaricap);

    }
}
