package day15_methodCreation;

import java.util.Scanner;

public class C02_MethotCreation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime =scan.next();
        String tersKelime="";
        if (kelime.length()<3){
            System.out.println("kelime çok kıssa");
        } else if (kelime.length()<=5){
            if (kelime.length()==3){
                tersKelime= kelime.substring(2)+kelime.substring(1,2)+kelime.substring(0,1);
                System.out.println(tersKelime);
                System.out.println(kelime.length());

            }else if(kelime.length()==4){
                tersKelime= kelime.substring(3)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1);
                System.out.println(tersKelime);
                System.out.println(kelime.length());
            }else {
                tersKelime= kelime.substring(4)+kelime.substring(3,4)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1);
                System.out.println(tersKelime);
                System.out.println(kelime.length());
            }
        }else {
            System.out.println("kelime çok uzun");
        }


    }
}
