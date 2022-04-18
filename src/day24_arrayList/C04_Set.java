package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>();
        isimler.add("aykut");
        isimler.add("yusuf");
        isimler.add("Ilker");
        isimler.add("muhammet");
        System.out.println(isimler);
        isimler.set(1,"seckin");

        System.out.println(isimler);

        List<String> logListesi=new ArrayList<>();
        logListesi.add(isimler.set(1,"cosmos"));
        System.out.println(isimler);
        System.out.println(logListesi);

    }
}
