package day26_arrayForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04 {
    public static void main(String[] args) {
            String arr1[]={"Ali","Ayşe","Can","Fatma","mehmet","veli"};
            List<String> arr2=new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {

            if(!arr1[i].toLowerCase().contains("a")){arr2.add(arr1[i]);
            }
        }System.out.print(arr2);
    }
}
