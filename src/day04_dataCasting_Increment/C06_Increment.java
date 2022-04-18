package day04_dataCasting_Increment;

public class C06_Increment {
    public static void main(String[] args) {
        int numA=2; // numA+=3
        numA=numA+3;
        System.out.println(numA);

        int numB=10;
        numB*=7; // numB=numB*7
        System.out.println(numB);
        int numC=44;
        numC++;
        System.out.println(numC);
        int a=15;
        int b=++a;
        System.out.println(b);
        int sayi=20;
        System.out.println(sayi+10);
        sayi=sayi+10;
        System.out.println(sayi);
        System.out.println(sayi=sayi+10);
        System.out.println(sayi);
        System.out.println(sayi+=10);
        System.out.println(sayi);
        System.out.println(sayi++);
        System.out.println(sayi);
        System.out.println(++sayi);
        System.out.println(sayi);

        int sayi1=10;
        int sayi2=15;

        sayi2+=sayi1;
        System.out.println(sayi2);



    }
}
