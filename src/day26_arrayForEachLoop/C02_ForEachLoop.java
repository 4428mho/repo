package day26_arrayForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        int arr[]={2,3,4,6,5,8,9,1,7,10};
        
        List<Integer> sayılar = new ArrayList<>();
        for (int s:arr) {sayılar.add(s);}
        for (int each : sayılar) {if (each%3 !=0){System.out.print(each+ "  ");}}
        System.out.println("sayılar = " + sayılar);
    }
}
