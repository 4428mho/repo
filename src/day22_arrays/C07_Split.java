package day22_arrays;

import java.util.Arrays;

public class C07_Split {
    public static void main(String[] args) {
        String str ="ben bu Javanın gelmisini gecmisini";
        String kelimeler[]=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        System.out.println(kelimeler[1]);
        String javanın[]=str.split("Javanın");
        System.out.println(Arrays.toString(javanın));
        String str1[]=str.split("");
        System.out.println(Arrays.toString(str1));
    }
}
