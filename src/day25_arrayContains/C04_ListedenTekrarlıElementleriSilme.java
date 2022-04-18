package day25_arrayContains;

import java.util.ArrayList;
import java.util.List;

public class C04_ListedenTekrarlıElementleriSilme {
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

        tekrarsızListeOlustur(sayilar);

    }
    public static void tekrarsızListeOlustur(List<Integer> sayilar) {
        List<Integer> tekrarsiz=new ArrayList<>();
        for (int i = 0; i < sayilar.size(); i++) {
            if(!tekrarsiz.contains(sayilar.get(i))){
                tekrarsiz.add(sayilar.get(i));
            }
        }
        System.out.println("tekrarsiz = " + tekrarsiz);
    }
}
