package day36_inheritance;

public class SurekliIsciler extends Isci {


    public static void main(String[] args) {


        SurekliIsciler surIc1 = new SurekliIsciler();
        surIc1.persNo = 5001;
        surIc1.isim = "cem";
        surIc1.soyİsim = "Akay";
        surIc1.status = "Isci";
        surIc1.saatUcreti = 11;
        surIc1.maas = surIc1.maasHesapla();
        System.out.println("surIc1 = " + surIc1);

    }

    @Override
    public String toString() {
        return "SurekliIsciler{" +
                "\nİsciStatu='" + İsciStatu + '\'' +
                ",\nsaatUcreti=" + saatUcreti +
                ", \nstatus='" + status + '\'' +
                ",\n maas=" + maas +
                ",\n persNo=" + persNo +
                ",\n isim='" + isim + '\'' +
                ",\n soyİsim='" + soyİsim + '\'' +
                ",\n adres='" + adres + '\'' +
                ",\n tel='" + tel + '\'' +
                '}';
    }
}