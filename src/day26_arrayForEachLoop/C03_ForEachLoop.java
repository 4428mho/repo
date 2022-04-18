package day26_arrayForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        String arr1[]={"Ali","Ayşe","Can","Fatma"};
        String arr2[]={"Evren","Emsal","Emre","Can","Fatma"};
        List<String>ortEleman=new ArrayList<>();

        for (String each:arr1
             ) {
            for (String each2:arr2
                 ) {if(each.equals(each2)){
                     ortEleman.add(each);
            }
            }
        }if (ortEleman.isEmpty()){
            System.out.println("ortak eleman yok");
        }else System.out.println(" arr lerdeki ortak eleman latın listesi: "+ortEleman);
    }
}
