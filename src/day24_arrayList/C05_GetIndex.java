package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_GetIndex {
    public static void main(String[] args) {


        List<Integer> sayilarList = new ArrayList<>();

        sayilarList.add(5);
        sayilarList.add(3);
        sayilarList.add(0, 7);
        sayilarList.add(2, 7);
        System.out.println("SayilarList = " + sayilarList);
        sayilarList.get(2);
        System.out.println( sayilarList.get(1));
    }
}