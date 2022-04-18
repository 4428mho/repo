package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_MDArrays {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle=scan.nextLine();
        String arr[]=cumle.split(" ");
        int ux=arr.length;
        System.out.println(ux);
    }
}
