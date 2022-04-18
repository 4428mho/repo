package day06_scanner;

public class C03_SwapVariablesTempOlmadan {
    public static void main(String[] args) {

        int Sayi1=10;
        int sayi2=20;
        System.out.println("Swap'dan once");
        System.out.println("Sayi1 = " + Sayi1);
        System.out.println("Sayi2 = " + sayi2);
        Sayi1 = Sayi1 - sayi2;
        sayi2 = Sayi1 + sayi2;
        Sayi1 = sayi2 - Sayi1;
        System.out.println("Swap'dan sonra");
        System.out.println("Sayi1 = " + Sayi1);
        System.out.println("Sayi2 = " + sayi2);
        int sayi;
        sayi=5;
        System.out.println("sayi= "+sayi);

        boolean ogrenciMi;
        int not;
        double ortalama;
        String isim;


        isim="Mehmet";
        ogrenciMi=false;
        not=85;
        ortalama=78.3;
        System.out.println("isim= "+isim );
        System.out.println("ogrenciMi= "+ogrenciMi);
        System.out.println("not= "+not);
        System.out.println("ortalama= "+ortalama);
}
}
