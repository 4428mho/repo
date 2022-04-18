package day13_stringManipulation;

import java.util.Scanner;

public class D01_odev {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir Şifre belirleyin");
        String Sifre=scan.nextLine();
        String str1=Sifre.substring(0,1);
        char str2=str1.charAt(0);
        int str3=Sifre.length();
        char str4=Sifre.charAt(str3-1);
        int ilkSpace=Sifre.indexOf(" ");
        if (str2>'A'|| str4>='A'&&str4<='Z'|| str3<8||ilkSpace>=0){
            System.out.println("Lütfen geçerli bir şifre giriniz");
        }else  {System.out.println(" İşlem başarılı");}

    }

}


