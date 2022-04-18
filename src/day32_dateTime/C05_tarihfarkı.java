package day32_dateTime;

import javax.swing.tree.FixedHeightLayoutCache;
import java.time.LocalDate;
import java.time.Period;

public class C05_tarihfarkı {
    public static void main(String[] args) {
        LocalDate bugün=LocalDate.now();
        LocalDate Dogumgünü=LocalDate.of(1984,8,18);
        System.out.println(Period.between(Dogumgünü,bugün));
        System.out.println(Period.between(Dogumgünü,bugün).getYears());

    }
}
