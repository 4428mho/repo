package day32_dateTime;

public class C06_Varargs {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        int z=30;
        int t=40;
        int r=50;
        int k=60;
        topla(x,y);
        topla(x,y,z);
        topla(x,y,z,t);
        topla(x,y,z,r,t);
        topla(x,y,z,r,t,k);

    }

    private static void topla(int... x) {
        int toplam=0;
        for (int each: x
             ) {
            toplam+=each;
        }
        System.out.println(toplam);
    }

}
