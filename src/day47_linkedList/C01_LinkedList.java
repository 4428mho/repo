package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {
        LinkedList <Integer>ll1=new LinkedList<>();
        ll1.add(10);
        // sadece list interface'inden özellikler kullanmak istersek
        List<Integer> ll2=new LinkedList<>();
        // sadece dequ den gelen özellikleri kullanmak için
        Deque<Integer>ll3=new LinkedList<>();
        ll3.addLast(20);
        ll3.addFirst(15);
        ll3.addLast(40);
        System.out.println("ll3 = " + ll3);
        //LinkedListin iki parent Iitercaces i vardır.
        //LinkedList kullanırken data türü list seçersek List intercaces drki metotları kullanır
        //QUE kullanısak ona ait metotlar gelir.



    }
}
