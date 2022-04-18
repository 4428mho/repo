package day08_ifElse01;

public class C02_IfStatements {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        if (a>b && b<100){
            System.out.println("isleminiz gerceklesecek valla");
            System.out.println("bady içindeki tüm kodlar çalışır");
        }
        if (a<0) System.out.println("süslü parantez olmazsa sadece 1 satır çalışır");
        System.out.println("2.satır calsır");
    }
}
