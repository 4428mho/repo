package day24_arrayList;

import day23_multiDimensionalArrays.C06_Arrays;

import java.util.Arrays;

public class C01_List {
    public static void main(String[] args) {
        int arr[]={};
        arr=C06_Arrays.arrayeElemanEkle(arr,5);
        System.out.println(Arrays.toString(arr));

        arr=C06_Arrays.arrayeElemanEkle(arr,3);
        System.out.println(Arrays.toString(arr));
    }
}
