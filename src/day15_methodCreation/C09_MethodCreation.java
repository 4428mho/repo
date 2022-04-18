package day15_methodCreation;

import javax.swing.*;

public class C09_MethodCreation {

    private static String Soyisim;

    public static void main(String[] args) {
        String isim= JOptionPane.showInputDialog(null,"İsim");
        String Soyisim= JOptionPane.showInputDialog(null,"Soyisim");
        String kkNy= JOptionPane.showInputDialog(null,"kkNo");


        String yeniIsım=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\S","*");
        String yeniSoyisim=Soyisim.substring(0,1).toUpperCase()+Soyisim.substring(1).replaceAll("\\S","*");
        String kkNoy="**** **** **** "+kkNy.substring(12);
        System.out.println("İsim Soyisim : "+yeniIsım+" "+yeniSoyisim+" \n"+kkNoy);

        JOptionPane.showMessageDialog(null,"İsim Soyisim : "+yeniIsım+" "+yeniSoyisim+" \n"+kkNoy);

        isimSoyisimGizle(isim,Soyisim);
        krediKartıGizle(kkNy);

    }

    public static String krediKartıGizle(String kkNy) {
        String kkNoy="**** **** **** "+kkNy.substring(12);
        return kkNoy;
    }
    public static String isimSoyisimGizle(String isim, String soyisim) {
        String yeniIsım=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\S","*");
        String yeniSoyisim=Soyisim.substring(0,1).toUpperCase()+Soyisim.substring(1).replaceAll("\\S","*");
        return yeniIsım +"  "+yeniSoyisim;
    }
}
