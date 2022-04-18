package day08_ifElse01;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.println("Lütfen Yaşınızı Giriniz");
        int Yas = scan.nextInt();
        if (Yas>=65){
            System.out.println("emekli olabilirsin");
        }
        else {
            System.out.println("emekli olamazsın");
        }
        System.out.println(65-Yas + "sene daha çalışmalısın");
    }
}
