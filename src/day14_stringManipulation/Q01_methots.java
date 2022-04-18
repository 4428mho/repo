package day14_stringManipulation;

import java.util.Scanner;

public class Q01_methots {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("4 harfli bir kelime giriniz");
        String imput =scan.next();
        String tersKarakter=imput.substring(imput.length()-1)
                +imput.substring(2,3)
                +imput.substring(1,2)
                +imput.substring(0,1);
        System.out.println(tersKarakter);



    }
}
