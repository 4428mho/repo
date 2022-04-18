package day25_arrayContains;

import java.util.ArrayList;
import java.util.List;

public class C08_ListedeElemanlarinYeriniDegistirme {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);
        int ilkinx=2;
        int ikinci=5;

        sayilar=swapelements(sayilar,ilkinx,ikinci);
    }

    public static List<Integer> swapelements(List<Integer> sayilar, int ilkinx, int ikinci) {
        return sayilar;
    }
}
