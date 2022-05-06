package day46_itrator_collections;

import java.util.*;

public class C02_Listenin_ElemanlarınıArttirmak {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(5,7,8,6,9));

        Iterator itr=list1.iterator();

        ListIterator itr2=list1.listIterator();

        while (itr2.hasNext()){
            Object sayı=itr2.next();
            itr2.set((Integer)sayı+3);
        }
        System.out.println(list1);
    }
}

