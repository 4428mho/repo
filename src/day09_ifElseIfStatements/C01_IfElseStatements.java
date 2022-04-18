package day09_ifElseIfStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {
        double sayi=564;

        String sonuc= sayi >=0 ? (sayi%2==0?"sayi çifttir":"sayi tektir" ):(sayi<-100?"-100 den küçük negatif":"-100 den büyük ");

        System.out.println(sonuc);
    }

}