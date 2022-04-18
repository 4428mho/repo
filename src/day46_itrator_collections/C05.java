package day46_itrator_collections;

import java.util.LinkedList;

public class C05 {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();
        list.add(3);
        list.add(20);
        list.addFirst(5);
        list.addLast(6);
        list.add(2,44);
        System.out.println("list = " + list);
    }
}
