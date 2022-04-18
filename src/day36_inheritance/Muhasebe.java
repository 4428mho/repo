package day36_inheritance;

public class Muhasebe extends Personel{

    protected int saatUcreti;
    protected String status;
    protected int maas;



    protected int maasHesapla(){
        int maas=saatUcreti*8*30;
        return maas;
    }

}
