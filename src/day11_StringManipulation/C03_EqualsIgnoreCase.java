package day11_StringManipulation;

import java.util.Scanner;

public class C03_EqualsIgnoreCase {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println( "Derse Katilmak Istermisiniz? \n Evet veya Hayır yaziniz");
        String cevap= scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabiniz : " +cevap+" derse katiliminiz onaylanmiştir");}
        else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabiniz : "+cevap+" sonraki derse bekleriz");
        } else {
            System.out.println("lutfen evet veya hayır yaziniz");
        }


    }
}
