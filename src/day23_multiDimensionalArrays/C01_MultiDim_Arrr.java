package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MultiDim_Arrr {

    public static void main(String[] args) {
        int arr [][]= {{3,1,7,15,89,4,63},{6,10,2}};
        System.out.println(arr[0][2]);
        System.out.println(arr[1][1]);
        System.out.println(Arrays.deepToString(arr));
int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam +=arr[i][j];
            }
        }

        System.out.println("toplam = " + toplam);
    }
}
