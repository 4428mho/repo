package day14_stringManipulation;

import javax.swing.*;

public class C03_StringSayiToplama {
    public static void main(String[] args) {
        String str1="$13.99";
        String str2="$10.55";
        String fiyat1=str1.substring(1);
        String fiyat2=str2.substring(1);
        double a1=Double.parseDouble(fiyat1);
        double a2=Double.parseDouble(fiyat2);
        System.out.println("$"+(a1+a2));
        JOptionPane.showMessageDialog(null,"Toplam = $"+(a1+a2));

    }
}
