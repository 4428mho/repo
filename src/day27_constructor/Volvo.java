package day27_constructor;

public class Volvo {
    String marka ="Volvo";
    String mensei="Isvec";
    String model;
    boolean elektirikliMi;
    int yil=2023;
    String yakit;
    boolean otomatikPilot=otomatikPilotSorgusu();
    int maxHiz=maxHizAta();

    public Volvo(String mdl, boolean hyr, int yl, String ykt) {
        model=mdl;
        elektirikliMi=hyr;
        yil=yl;
        yakit=ykt;
    }
    public Volvo(){}
    private int maxHizAta() {
        maxHiz=0;
        if (elektirikliMi){
            maxHiz=160;
        }else {
            maxHiz=240;
        }
        return maxHiz;
    }

    public boolean otomatikPilotSorgusu() {
        boolean sonuc=true;
        if (elektirikliMi){
            sonuc=true;
        }else {
            sonuc=false;
        }
     return sonuc;
    }
public String toString(){
    String arabaozellikleri="Model : "+ model +
                             "Yakıt : "+ yakit +
                             "Üretim yılı :  "+yil +
                              "  Max Hız : " +maxHiz;


        return arabaozellikleri;
}

}
