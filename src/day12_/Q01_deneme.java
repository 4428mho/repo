package day12_;

import javax.swing.*;

public class Q01_deneme {
    public static void main(String[] args) {
        String s1= JOptionPane.showInputDialog(null,"1.sayı....");
        String s2= JOptionPane.showInputDialog(null,"2.sayı....");
        int toplam=Integer.parseInt(s1)+Integer.parseInt(s2);
        JOptionPane.showMessageDialog(null,"Toplam = "+toplam);



    }
}
