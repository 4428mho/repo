package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C08_MDArrays {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5},{6,0,2}};
        int carpım=1;
        for (int i = 0; i <arr.length ; i++) {
            carpım*=arr[i][arr[i].length-1];
            }
        System.out.println(carpım);
        }
    }

