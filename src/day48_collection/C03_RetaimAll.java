package day48_collection;

import java.util.HashSet;
import java.util.Set;

public class C03_RetaimAll {
    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();

        s1.add(10);
        s1.add(20);
        s1.add(30);

        s2.addAll(s1);
        s2.add(12);
        s2.add(16);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s2.retainAll(s1));

        System.out.println(s1);
        System.out.println(s2);

    }

}
