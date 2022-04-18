package day18_WhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
        int baslangıc=40;
        int bitis=60;
        for (int i = baslangıc; i <=bitis ; i++) {
            System.out.print(i+" ");
        }
        System.out.println(" ");
        while (baslangıc<=bitis){

            System.out.print(baslangıc+" ");
            baslangıc++;
            System.out.println("");
            System.out.print("baslangıc = " + baslangıc);
        }
    }

}
