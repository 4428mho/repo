package day28_constructor;

public class StaticKeyword {
    
    static int sayi1;
    int sayi2;

    public static void main(String[] args) {
        System.out.println("sayi1 = " + sayi1);
      StaticKeyword obj1=new StaticKeyword();
        System.out.println(obj1.sayi2);

        sayi1++;
        obj1.sayi2++;
        System.out.println("obj1.sayi2 = " + obj1.sayi2);//1
        System.out.println("obj1.sayi1 = " + obj1.sayi1);//1

        StaticKeyword obj2=new StaticKeyword();

        System.out.println(obj2.sayi2);//0 yazdırır
        System.out.println(obj2.sayi1);//1 yazdırır
    }


}

