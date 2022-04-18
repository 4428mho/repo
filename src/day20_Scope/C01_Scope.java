package day20_Scope;

public class C01_Scope {

    int sayi;
    String okulIsmi="muhammet";
    boolean okulAcikMi;
    static int sayi1;
    public static void main(String[] args) {
        
        C01_Scope obj1= new C01_Scope();
        obj1.sayi=10;
        System.out.println("obj1.okulAcikMi = " + obj1.okulAcikMi);
        
        C01_Scope obj2=new C01_Scope();
        obj2.okulAcikMi=true;
        System.out.println(obj2.okulAcikMi);
        aliveli();
        int sayı6;


    }

    private static void aliveli() {

        int sayı6=15;
        for (int i = 0; i < 15; i++) {
            int sayı9=i;

        }
    }
}
