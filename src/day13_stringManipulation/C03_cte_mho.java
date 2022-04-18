package day13_stringManipulation;

import java.util.Scanner;

public class C03_cte_mho {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir Şifre belirleyin");
        String Sifre=scan.nextLine();
        String str1=Sifre.substring(0,1);
        char str2=str1.charAt(0);
        int str3=Sifre.length();
        char str4=Sifre.charAt(str3-1);
        int ilkSpace=Sifre.indexOf(" ");
        if (str2>'A'){
            System.out.println("Şifreniz büyük harf ile başlamalı");
        }else if(str4>='A'&&str4<='Z'){
            System.out.println("Şifreniz küçük harfle bitmeli");
        }else if(str3<8){
            System.out.println("Girgiğiiz şifre çok kısa");
        }else if(ilkSpace>=0){
            System.out.println("Girdiğiniz Şifre boşluk içermemeli");
        } else {
            System.out.println(" İşlem başarılı");
        }



        }


    }

