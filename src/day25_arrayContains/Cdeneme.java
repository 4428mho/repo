package day25_arrayContains;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cdeneme {
    public static void main(String[] args) {
        List<Double> sayilar=new ArrayList<>();
        List<Double> sayilar2=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
       double x=scan.nextInt();
        for (double i = 1; i <=x ; i++) {
            sayilar.add(i);
        }
        Scanner scan1=new Scanner(System.in);
        double x2=scan.nextInt();

        for (double i = 1; i <=x2 ; i++) {
            sayilar2.add(i);
        }
        System.out.println(sayilar);
        System.out.println(sayilar2);
    }
}
