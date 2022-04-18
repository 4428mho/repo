package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {
        Deque<Integer>ll1=new LinkedList<>();
ll1.add(15);
ll1.add(20);
ll1.add(45);
ll1.add(50);
ll1.add(60);
ll1.add(70);
ll1.add(80);
ll1.add(90);
        System.out.println(ll1.peek());//ilki yazdırdı
        System.out.println(ll1);
        System.out.println(ll1.poll());//ilki yazdırıp sildi
        System.out.println(ll1);
        System.out.println(ll1.pollFirst());//sonraki ilk elemanı yazdırdı nve sildi
        System.out.println(ll1);
        System.out.println(ll1.pollLast());//enson elemanı yazdırdı ve sildi
        System.out.println(ll1);
        System.out.println(ll1.pop());//en baştakini yazdırdı ve sildi
        System.out.println(ll1);
        ll1.removeFirstOccurrence(50);
        System.out.println(ll1);
    }
}
