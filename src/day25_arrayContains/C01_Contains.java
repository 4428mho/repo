package day25_arrayContains;

import java.util.ArrayList;
import java.util.List;

public class C01_Contains {
    public static void main(String[] args) {
        List<String> harfler=new ArrayList<>();
        harfler.add("D");
        harfler.add("M");
        harfler.add(1,"T");
        harfler.add(0,"T");
        System.out.println("harfler = " + harfler);
        harfler.contains("T");
        System.out.println(harfler.contains("T")+"1");
        System.out.println(harfler.contains("F"));
        List<String> karakterler=new ArrayList<>();
        karakterler.add("M");
        karakterler.add("T");
        System.out.println(harfler.containsAll(karakterler));
        karakterler.add("F");
        System.out.println(harfler.containsAll(karakterler));
    }
}
