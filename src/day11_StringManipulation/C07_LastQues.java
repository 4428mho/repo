package day11_StringManipulation;

import java.util.Scanner;

public class C07_LastQues {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Bir Cümle  yazınız");
        String cumle= scan.nextLine();
        System.out.println("bir kelime yazınız ");
        String kelime=scan.nextLine();

        int ilkKullanım=cumle.indexOf(kelime);
        int ikinciKullanım=cumle.lastIndexOf(kelime);
        if(ilkKullanım==(1)){
            System.out.println("kullanılmamış");
        } else if(ilkKullanım==ikinciKullanım){
            System.out.println("bir defa kullanılmış");
        }else {
            System.out.println("birden fazla var");
        }

    }
}
