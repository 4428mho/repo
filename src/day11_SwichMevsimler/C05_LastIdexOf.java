package day11_SwichMevsimler;

import java.util.Scanner;

public class C05_LastIdexOf {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Bir Cümle  yazınız");
        String cumle= scan.nextLine();
        System.out.println(cumle.lastIndexOf("p",4));
    }
}
