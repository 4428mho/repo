package day25_arrayContains;

import java.util.ArrayList;
import java.util.List;

public class C07_Lists {
    public static void main(String[] args) {
        List<Double> sayilar=new ArrayList<>();
        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(6.0);
        sayilar.add(1.0);
        sayilar.add(7.0);
        Double ortalama=0.0;
        Double toplam=0.0;
        for (int i = 0; i <sayilar.size() ; i++) {toplam+=sayilar.get(i);}

        ortalama=toplam/sayilar.size();
        System.out.println("ortalama = " + ortalama);

        List<Double> ortUstu=new ArrayList<>();

        for (int i = 0; i < sayilar.size(); i++) {if (sayilar.get(i)>ortalama)
        {ortUstu.add(sayilar.get(i));}}

        System.out.println("ortUstu = " + ortUstu);
    }
}
