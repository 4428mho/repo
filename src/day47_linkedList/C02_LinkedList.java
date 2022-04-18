package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {
        Deque<Integer>ll1=new LinkedList<>();
        ll1.addFirst(10); //enbaşa eleman ekler daha hızlıdır
        ll1.element();
        System.out.println("ll1.element() = " + ll1.element());
        ll1.offer(10);
        
        
        
    }
}
