package day21_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {


        int[] arr = {1, 3, 5};
        int arr1[] = {1, 3, 5};
        int[] arr3 = {10, 25, 39};

        double arr4[] = {78.5, 48.78, 4};

        String[] arr5 = {"ali", "veli", "ayşe"};

        int sayi;
        int arr6[];


        int arr7[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("arr7 = " + arr7[i]);

        }
        System.out.println(Arrays.toString(arr7));

        arr7[1] = 11;
        arr7[3] = 22;

        System.out.println(Arrays.toString(arr7));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr5));

        int bos[]=new int[6];

        System.out.println(Arrays.toString(bos));

    }}




