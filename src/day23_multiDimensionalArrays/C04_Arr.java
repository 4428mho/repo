package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arr {
    public static void main(String[] args) {
        // kullaniciya kac elementlik bir array olusturacagini sorun
       // array'i olusturup elementleri kullanicidan alip, array'e atayin
        Scanner scan=new Scanner(System.in);
        System.out.println("kac elementlik bir array olusturacaksınız");
        int uz=scan.nextInt();
        int arr[]=new int[uz];
        for (int i = 0; i < uz; i++) {
            System.out.println(" arr için "+(+i+1)+". elemanı giriniz");
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
