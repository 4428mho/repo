package day30_passByValue;

public class C03_PassByValue {
    public static void main(String[] args) {
        double etiketFiyatı = 100;
        yuzdeOnIndirim(etiketFiyatı);
        yuzdeOnIndirim(etiketFiyatı);
        System.out.println("iki indirim sonrası fiyat "+etiketFiyatı);
        System.out.println(etiketFiyatı);
    }
    private static void yuzdeOnIndirim(double x) {
       x=x*0.90;
        System.out.println("sizin için indirimli fiyat "+x);

    }
}