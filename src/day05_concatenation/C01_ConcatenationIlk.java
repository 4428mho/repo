package day05_concatenation;

public class C01_ConcatenationIlk {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Guzel";
        int sayi1=5;
        int sayi2=3;
        System.out.println(str1+sayi1+str2);
        System.out.println(sayi1-sayi2+str2+sayi1*sayi2);
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));
        System.out.println(sayi1+(sayi2+str2));
        System.out.println(""+sayi1+sayi2+str2);
        boolean sonucu1=5+2==7;
        boolean sonucu2=5*2==10;
        System.out.println(sonucu1);
        System.out.println(sonucu2);
        boolean sonucu3=5+2!=7;
        System.out.println(sonucu3);
        System.out.println(5*2!=15);
        System.out.println(5+2>=7);
        System.out.println(5+2<=7);
        boolean sonucu4=(5+2==7)&&(4+3!=5);
        System.out.println(sonucu4);
        System.out.println("satir31");
        boolean sunucu5=(5+2==7)||(4+3!=5);
        System.out.println(sunucu5);
        boolean sonuc6=5>4&&7<9&&6+3==9&&5+2!=8;
        System.out.println(sonuc6);
        boolean sonuc7=5>4&&7>9&&6+3==9&&5+2!=8;
        System.out.println(sonuc7);
        boolean sonuc8=5>4&7>9&6+3==9&5+2!=8;
        System.out.println(sonuc8);
        int sayi9=15;
        System.out.println(10<sayi9  &&  sayi9<20);
    }

}





