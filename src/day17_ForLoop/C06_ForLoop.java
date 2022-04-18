package day17_ForLoop;

public class C06_ForLoop {
    public static void main(String[] args) {
        char iklHarf='c';
        char sonHarf='s';
        for (char i = iklHarf; i <=sonHarf ; i++) {
            System.out.print( "," +i);

        }
        double baslangic=10;
        double bitis=20;
        double artis=0.50;

        for (double i = baslangic; i <=bitis ; i+=artis) {
            System.out.println("i = " + i);

        }
    }
}
