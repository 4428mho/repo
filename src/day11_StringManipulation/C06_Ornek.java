package day11_StringManipulation;

import java.util.Scanner;

public class C06_Ornek {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("e mail gir");
        String mail =scan.next();

        if ((mail.indexOf("@"))==(-1)){
            System.out.println("geçersiz");

        }else {
            System.out.println("ok");
        }
    }
}
