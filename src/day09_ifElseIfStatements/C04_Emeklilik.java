package day09_ifElseIfStatements;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("y =");
        double y= scan.nextDouble();

        System.out.println((y > 5) ? (y<10 ? 2*y : 3*y): (y>10 ? 2+y : 3+y));

        System.out.println((y%2==0?"çift":"tek"));

    }
}


