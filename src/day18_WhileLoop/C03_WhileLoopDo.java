package day18_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoopDo {
    public static void main(String[] args) {
            //Kullanicidan toplamak uzere pozitif sayilar isteyin, 
            // islemi bitirmek icin 0’a basmasinisoyleyin.
            //Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve 
            // “Negatif sayigiremezsiniz” yazdirip basa donun
            //Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, 
            // yanlislikla kac negative sayigirdigini 
            // ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

        Scanner scan=new Scanner(System.in);
        int sayi=10000;
        int tplm=0;
        int sayacPozitif=0;
        int sayacNegatif=0;

        do {
            System.out.println("+ bir sayı girin\n bitirmek için 0 a basın");
            sayi=scan.nextInt();
            if (sayi<0){
                System.out.println("- sayı giremezsiniz");
                sayacNegatif++;
            }else if (sayi>0){
                tplm+=sayi;
                sayacPozitif++;
                
            }
        }while (sayi!=0);
        System.out.println("sayacNegatif = " + sayacNegatif);
        System.out.println("sayacPozitif = " + sayacPozitif);
        System.out.println("tplm + = " + tplm);


    }
}
