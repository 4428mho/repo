package day08_ifElse01;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Gün İsmi Giriniz");
        String gunIsmi=scan.next().toUpperCase();
        if (gunIsmi.equals("PAZAR")||gunIsmi.equals("CUMARTESİ")){
            System.out.println("girdiğiniz gün haftasonu");
    }
        else {
            System.out.println("girdiginiz gun hafaiçi");
        }
}
}
