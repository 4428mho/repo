package day09_ifElseIfStatements;

import java.util.Scanner;

public class C03_SayiKontrol {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen iki sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        if (sayi1>0&&sayi2>0){
            System.out.println("girdiğiniz sayılar pzitif olduğundan toplamlari =  "+ (sayi1+sayi2));
    }
        else if (sayi1<0&&sayi2<0){
            System.out.println("girdiğiniz sayılar negatif olduğundan carpimları = "+ (sayi1*sayi2));
        }
        else if(sayi1*sayi2<0){
            System.out.println("farklı isaretlsayılarla işlem yapılamaz");
        }
        else {
            System.out.println("sıfır yutan eleman ");

        }
}
}
