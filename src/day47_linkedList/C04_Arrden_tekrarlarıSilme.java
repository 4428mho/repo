package day47_linkedList;

import java.util.Set;
import java.util.TreeSet;

public class C04_Arrden_tekrarlarıSilme {

    public static void main(String[] args) {
        int arr[]={3,5,4,6,3,1,2,7,8,6,1,4,2,8};
        arr=benzersizyap(arr);

    }

    private static int[] benzersizyap(int[] arr) {
        Set<Integer>benzersizSet=new TreeSet<>();
        for (Integer each:arr
             ) {benzersizSet.add(each);
            System.out.println("benzersizSet = " + benzersizSet);
        }return arr;
    }


}
