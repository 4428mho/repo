package day11_SwichMevsimler;

import java.util.Scanner;

public class C01_Mevsim {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen kacinic ay oldugunu yazın");
        int  sayi= scan.nextInt();
        switch (sayi) {
            case 12:
            case 1:
                case 2:
                System.out.println("kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("bahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar ");
                break;
            default:
                System.out.println("Ayları girmek için geçerli sayı değil");


        }
    }
}
