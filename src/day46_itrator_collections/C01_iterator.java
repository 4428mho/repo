package day46_itrator_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_iterator {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(5,7,8,6,9));
        Iterator itr=list1.iterator();
        System.out.println(itr.hasNext());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
    }

}
