package day49_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {
        List<Object>list=new ArrayList<>();
        list.add("ergin");
        list.add(15);
        list.add(10.45);

        System.out.println(list);
        list.set(1,(Integer)(list.get(1))+10);

        Map<Integer,String>sinifList=new HashMap<>();
        
         sinifList.put(2012,"Mustaf, Kara,Doktor");
         sinifList.put(2002,"Yasin,Çalışkan,Manav");
         sinifList.put(1034,"Orhan,Veli,Şair");
        System.out.println("sinifList = " + sinifList);
        System.out.println(sinifList.keySet());
        System.out.println((sinifList.values()));
    }
}
