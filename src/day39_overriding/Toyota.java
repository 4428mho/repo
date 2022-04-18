package day39_overriding;

public class Toyota extends Araba{

    String hiz="Toyotalar max 220 km yapar";
    String marka="Toyota";
    String sirketMerkezi="japonya";

    public void  motor(){System.out.println("toyota marka motor kullanır");}
    public void garanti(){
        System.out.println("on yıl garantili Toyota");
    }

}
