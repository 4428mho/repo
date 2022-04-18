package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_List {
    public static void main(String[] args) {
        List<Integer> sayilarList=new ArrayList<>();
        System.out.println("SayilarList = " + sayilarList);
        sayilarList.add(5);
        sayilarList.add(3);
        sayilarList.add(0,7);
        sayilarList.add(2,7);
        System.out.println("sayilarList = " + sayilarList);

    }
}
