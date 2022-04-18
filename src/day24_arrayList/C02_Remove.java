package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>();
        isimler.add("aykut");
        isimler.add("yusuf");
        isimler.add("Ilker");
        isimler.add("muhammet");
        System.out.println("isimler = " + isimler);
        isimler.remove("yusuf");
        System.out.println("isimler = " + isimler);

        boolean sounc=isimler.remove("aykut");
        if (sounc==true){
            System.out.println("silindi");
    }else {
            System.out.println("olmadı ya kullanıcı");
        }
        isimler.remove(1);
        System.out.println(isimler);
    }
}
