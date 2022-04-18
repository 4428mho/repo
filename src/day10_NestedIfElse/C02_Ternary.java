package day10_NestedIfElse;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");

        int sayi= scan.nextInt();
        System.out.println(sayi%2==0 ? "sayi çifttir":"sayi tektir");

    }
}
