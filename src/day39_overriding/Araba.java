package day39_overriding;

public class Araba {
    String hareket ="Arabalar Teker ile hareket eder";
    String hiz="Arabalar motor gücüne göre hiz yaparlar";
    String yakit="Arabalar farklı yakıt kullanırlar";
    String marka="her arabanın bir markası vardır";

    public void  motor(){System.out.println("iki farklı motoru var");}
    public void yakitTuketim(){System.out.println("dizel veya benzinli ");}

}
