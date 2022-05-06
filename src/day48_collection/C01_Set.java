package day48_collection;

import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        Integer arr[]={1,1,1,129,1,1,1,145,1,1,1,1,1,1,1,1,12,2,2,2,2,2,2,24,4,4,44,4,};

        arryitekrarsızYazdır(arr);
    }

    private static void arryitekrarsızYazdır(Integer[] arr) {
        Set<Integer> tekrasizlar=new HashSet<>();
        for (Integer k:arr
             ) {tekrasizlar.add(k);

        }
        System.out.println(tekrasizlar);
    }
}
