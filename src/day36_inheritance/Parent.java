package day36_inheritance;

public class Parent {
    protected Parent (){

        System.out.println("sayi = " + sayi);
        System.out.println("Parent baba constactor çalıştı");
    }

    protected Parent(int sayi3,int sayi4){

        System.out.println("baba 2 ");
    }
    protected int sayi=15;
    
}
