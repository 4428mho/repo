package day48_collection;

import java.util.HashSet;
import java.util.Set;

public class C02_Hash {
    public static void main(String[] args) {
        String str="Java çok güzel";
        System.out.println(str.hashCode());
        String str2="Hava çok güzel";
        System.out.println(str2.hashCode());
        Set<Integer> sayiKümesi=new HashSet<>();
        System.out.println(sayiKümesi.hashCode());
        sayiKümesi.add(10);
        System.out.println(sayiKümesi.hashCode());
        sayiKümesi.add(20);
        System.out.println(sayiKümesi.hashCode());
    }
}
