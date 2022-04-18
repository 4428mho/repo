package day11_SwichMevsimler;

import java.util.Scanner;

public class C06_CumaIkinciDers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Gmail adresini giriniz");
        String email=scan.nextLine();
        String arananMetin="@gmail.com";

        if (!email.contains(arananMetin)){
            System.out.println("Lütfen gmail adresini yazınız");
        }else if(email.lastIndexOf(arananMetin)==(email.length()-10)){
            System.out.println("email adresin kaydedildi");
        }else {
            System.out.println("lütfen tekrar deneyiniz");
        }

        }


    }



