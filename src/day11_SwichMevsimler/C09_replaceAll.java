package day11_SwichMevsimler;

import java.util.Scanner;

public class C09_replaceAll {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen isin vr soy ismininzi yazınız");
       String isimSoyisim=scan.nextLine();
        System.out.println(isimSoyisim.replaceAll("\\S","*"));
    }
}
