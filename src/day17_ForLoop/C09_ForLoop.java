package day17_ForLoop;

public class C09_ForLoop {
    public static void main(String[] args) {
        int imput=9;
        int fak=1;
        String fakAcikYazim="";

        for (int i = imput; i >=1 ; i--) {
            fak*=i;
            if (i == imput) {fakAcikYazim=fakAcikYazim+i;
            }
            else {fakAcikYazim=fakAcikYazim+"*"+i;}
        }

    }
}
