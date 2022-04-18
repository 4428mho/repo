package day39_overriding;

import javax.swing.*;

public class Corolla extends Toyota{
    String hiz="Corolla max 2200 km yapar";
    String yakit="Corolla benzinli veya elektirikli olarak üretilir";
    String model="Corolla";


    public void  motor(){System.out.println("Corolla  marka araçlar çevreci motor kullanır");}
    public void yakitTuketimi(){
        System.out.println("Corolla 6.6 lt yakıt tüketilir");
    }
    public void vitesSayisi(){System.out.println("6 ileri vitesi var");
    }

    public static void main(String[] args) {
        Corolla arb1=new Corolla();
        System.out.println(arb1.hareket);//Araba kılasından
        System.out.println(arb1.hiz);//Corolla
        System.out.println(arb1.yakit);//corolla
        System.out.println(arb1.marka);//toyota
        System.out.println(arb1.sirketMerkezi);//Corolla
        System.out.println(arb1.model);//corolla
        arb1.motor();




        Toyota arb2=new Corolla();
        System.out.println(arb2.hareket);//Araba kılasından
        System.out.println(arb2.hiz);//toyota
        System.out.println(arb2.yakit);//Araba
        System.out.println(arb2.marka);//toyota
        System.out.println(arb2.sirketMerkezi);//Corolla
        //System.out.println(arb2.model);//cte
        arb2.motor();
        arb2.garanti();
        arb2.yakitTuketim();
        //arb2.vitesSayisi(); cte verir data türünden başayınca metotu bulamaz.

        Araba arb3=new Corolla();
        System.out.println(arb3.hareket);//Araba kılasından
        System.out.println(arb3.hiz);//araba
        System.out.println(arb3.yakit);//araba
        System.out.println(arb3.marka);//araba
        //System.out.println(arb3.sirketMerkezi);//cte
        //System.out.println(arb3.model);cte

        arb3.yakitTuketim();//override edilmiş corollada ki çalışır
        arb3.motor();
        //arb3.garanti(); çalışmaaaazzzzzzz

        Araba arb4=new Toyota();
        arb4.motor();//toyota çalıştı
        arb4.yakitTuketim();
        //arb4.model(); çalışmadı
    }
}
