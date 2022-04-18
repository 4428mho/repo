package day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        LocalTime tm=LocalTime.now();
        System.out.println(tm);
        double sayi=0;
        for (int i = 0; i < 100000; i++) {
            sayi+=i;
        }
        System.out.println(sayi);
        LocalTime tm2=LocalTime.now();
        System.out.println("tm2 = " + tm2);
        double nano1=tm.getNano();
        double nano2=tm2.getNano();
        System.out.println(nano2-nano1);
        System.out.println(tm2.plusMinutes(1000));
    }
}
