package day32_dateTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println("tarihSaat = " + tarihSaat);
        System.out.println(tarihSaat.plusYears(3).plusMonths(2).plusDays(10).plusHours(6).plusMinutes(25).plusNanos(25645646));
    }
}
