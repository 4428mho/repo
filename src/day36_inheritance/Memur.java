package day36_inheritance;

public class Memur extends Muhasebe {


    

    public static void main(String[] args) {


        Memur memur1 = new Memur();
        memur1.persNo=1001;
        memur1.adres="Ankara";
        memur1.isim="Ahmet";
        memur1.soyİsim="malatya";
        memur1.tel="042022564646";

        memur1.saatUcreti=10;
        memur1.maas= memur1.maasHesapla();
        memur1.status="Memur";
        System.out.println("memur1 = " + memur1);
        Memur memur2=new Memur();
        memur2.persNo=1002;
        memur2.saatUcreti=10;
        memur2.maas= memur2.maasHesapla();
        System.out.println("memur2 = " + memur2);

    }

    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", status='" + status + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyİsim='" + soyİsim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}