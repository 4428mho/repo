package day46_itrator_collections;

import java.util.*;

public class C03_TersYaz {
    public static void main(String[] args) {


    List<Integer> list1 = new ArrayList<>(Arrays.asList(5,7,8,6,9));
    ListIterator itr=list1.listIterator();


    while (itr.hasNext()){
        itr.next();
    }
    while (itr.hasPrevious()){
        System.out.print(itr.previous()+" ");
    }
}}
