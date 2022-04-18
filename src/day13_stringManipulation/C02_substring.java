package day13_stringManipulation;

public class C02_substring {
    public static void main(String[] args) {
        String str="1-48 arası 7999 sonuç  gösteriliyor. Aranan ürün: \"nutella\"";
        int ilkSpace=str.indexOf(" ");
        int ikinciSpace=str.indexOf(" ",ilkSpace+1);
        int üçüncüSpace=str.indexOf(" ",ikinciSpace+1);
        String aSS=str.substring(ikinciSpace+1,üçüncüSpace);
        System.out.println(aSS);

        int aSS2=Integer.valueOf(aSS);

        if (aSS2>100){
            System.out.println("süper");
        }else {
            System.out.println("durum kötü");
        }

    }
}
