package day21_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        int arr[];

        arr=new int[6];
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

        for (int i = 0; i < arr.length;i++) {
            arr[i]+=i;

            System.out.println(Arrays.toString(arr));
    }
        System.out.println(arr[arr.length-1]);
}}
