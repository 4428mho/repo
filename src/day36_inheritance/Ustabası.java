package day36_inheritance;

public class Ustabası extends Isci{

    

    public static void main(String[] args) {
        Ustabası ustabası1=new Ustabası();
        ustabası1.saatUcreti=15;
        ustabası1.isim="Murat";
        ustabası1.soyİsim="lazımdegil";
        ustabası1.maas= ustabası1.maasHesapla();
        ustabası1.status="isçi";
        ustabası1.İsciStatu="ustabası";
        System.out.println("ustabası1 = " + ustabası1);
    }
    @Override
    public String toString() {
        return "Ustabası{" +
                "\nİsciStatu='" + İsciStatu + '\'' +
                ",\n saatUcreti=" + saatUcreti +
                ",\n status='" + status + '\'' +
                ",\n maas=" + maas +
                ",\n persNo=" + persNo +
                ",\n isim='" + isim + '\'' +
                ",\n soyİsim='" + soyİsim + '\'' +
                ",\n adres='" + adres + '\'' +
                ",\n tel='" + tel + '\'' +
                '}';
    }
}
