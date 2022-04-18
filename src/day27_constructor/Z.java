package day27_constructor;

public class Z {
    String isim;
    String soyisim;
    int numara;
    boolean gercekmi;

    public Z(String ism, String soyism, int no, boolean grc) {
        isim=ism;
        soyisim=soyism;
        numara=no;
        gercekmi=grc;
    }
    public String toString(){
        return ("Isim :"+isim+ ", Soyİsim: "+soyisim+ " numara :"+numara);


    }
}
