package day18_WhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        int input=46464646;
        int rakam=0;
        int rToplam=0;

        while (input>0){
            rakam=input%10;
            rToplam+=rakam;
            input/=10;
        }
        System.out.println("rToplam = " + rToplam);

    }
}
