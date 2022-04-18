package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate trh=LocalDate.now();
        LocalDate trh3=LocalDate.now(ZoneId.of("Japan"));
        System.out.println(LocalDate.now(ZoneId.of("Japan")));
        LocalDate trh1=LocalDate.of(1984,8,26);
        System.out.println("trh1 = " + trh1);
        System.out.println("trh = " + trh.getMonthValue());
        System.out.println("trh = " + trh.getDayOfMonth());
        System.out.println("trh = " + trh.getDayOfWeek());
        System.out.println("trh = " + trh.atStartOfDay());
        System.out.println("trh = " + trh.getChronology());
        System.out.println("trh = " + trh.minusWeeks(20));
        System.out.println("trh = " + trh.minusYears(1996));

        System.out.println(LocalDate.now().isLeapYear());
        System.out.println(trh.isAfter(trh1));
        System.out.println();
    }
}
