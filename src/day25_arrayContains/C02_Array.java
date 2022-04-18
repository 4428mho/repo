package day25_arrayContains;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {
        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenEleman=5;
        System.out.println("istenmeyenEleman = " + istenmeyenEleman);
        System.out.println(Arrays.toString(arr));
        istenmeyenElementiSil(arr,istenmeyenEleman);
    }

    private static void istenmeyenElementiSil(int[] arr, int istenmeyenEleman) {
        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==istenmeyenEleman){
                sayac++;
            }
        }  int arrYeni[]=new int [arr.length-sayac];
           int index=0;
           for (int i = 0; i <arr.length ; i++) {
            if (arr[i]!=istenmeyenEleman){
                arrYeni[index]=arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(arrYeni));

    }
}
