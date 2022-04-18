package day27_constructor;

public class Toyota {
    String marka="Toyota";
    int tekerAdedi=4;
    boolean motorVarMi=true;
    String model;
    String yakit;
    int yil;

    public void maxHız(){
        if (yakit.equals("Benzin")){
            System.out.println("max 240 km");
        }else if (yakit.equals("Dizel")){
            System.out.println(" dizel max 260 km");
        }
    }
    public void renkliArabalar(){
        if (model.equals("Corolla")){
            System.out.println("beyaz ve kırmızı mevcuttur");
        }else if(model.equals("Yaris")){
            System.out.println("yaris için sarı ve mavi mevcut");
        }
    }

}
