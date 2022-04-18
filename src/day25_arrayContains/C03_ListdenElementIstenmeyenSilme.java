package day25_arrayContains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ListdenElementIstenmeyenSilme {
    public static void main(String[] args) {
        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenEleman=5;
        listileCoz(arr,istenmeyenEleman);

    }

    private static void listileCoz(int[] arr, int istenmeyenEleman) {

        List<Integer> yeniList=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] !=istenmeyenEleman){
                yeniList.add(arr[i]);
            }
        }
        System.out.println(yeniList);
    }
}
