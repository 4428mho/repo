package day08_ifElse01;

import java.util.Locale;
import java.util.Scanner;

public class C04_HaftaiciHaftaSonu {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Gün İsmi Giriniz");
        String gunIsmi=scan.next().toLowerCase();
        if (gunIsmi.equals("pazar")||gunIsmi.equals("cumartesi")){
            System.out.println("girdiğiniz gün haftasonu");
        }
        if  (gunIsmi.equals("pazartei")||gunIsmi.equals("cuma")||gunIsmi.equals("salı")
                ||gunIsmi.equals("çarşamba")||gunIsmi.equals("perşembe")){
            System.out.println("girdiğiniz gün haftaiçi");
    }
}
}