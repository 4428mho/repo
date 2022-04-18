package day08_ifElse01;

import java.util.Scanner;

public class C07_HaftaninGünleriIfElseIf {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Gün İsmi Giriniz");
        String gunIsmi=scan.next().toLowerCase();

        if (gunIsmi.equals("pazar")){
            System.out.println("girdiğiniz gün haftasonu");

        }
        else if (gunIsmi.equals("pazartei")||gunIsmi.equals("cuma")||gunIsmi.equals("salı")
                    ||gunIsmi.equals("çarşamba")||gunIsmi.equals("perşembe")){
                System.out.println("girdiğiniz gün haftaiçi");

        }
        else {
            System.out.println("geçerli bir gün giriniz");
        }


    }
}
