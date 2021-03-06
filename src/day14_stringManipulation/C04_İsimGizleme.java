package day14_stringManipulation;

import javax.swing.*;

public class C04_─░simGizleme {
    public static void main(String[] args) {
        // Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //      isim-soyisim : M***** B*******
        //      kart no : **** **** **** 1234
        String isim = "yasemin yalcin";
        String soyisim= "sari";
        String kKNo="1234567890128795";
        String yeniIsim=isimGizlemeMethodu(isim,soyisim);
        String yKart=kartGizlemeMehodu(kKNo);
        System.out.println("yKart = " + yKart);
        System.out.println("yeniIsim = " + yeniIsim);
    }

    public static String isimGizlemeMethodu(String isim, String soyisim) {
        String yeniIsim = isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");
        String yeniSoyisim= soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");
        return yeniIsim;

    }
    public static String kartGizlemeMehodu(String kKNo) {
        String yeniKKNo= "**** **** **** " + kKNo.substring(12);
        return yeniKKNo;
    }
}