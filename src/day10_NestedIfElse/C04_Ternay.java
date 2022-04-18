package day10_NestedIfElse;

public class C04_Ternay {

    public static void main(String[] args) {
        int sayi=121;

        if (sayi>=0){
            if (sayi%2==0){
                System.out.println("sayi pozitif çift sayi");
            }else {
                System.out.println("sayi pozitif tek sayi");
            }


        }else {
            if (sayi<-100){
                System.out.println("sayi -100 den küçük negatif = ");
            } else {
                System.out.println(" sayi -100 den büyük negatif=");
            }


        }
        String sonuc= sayi >=0 ? sayi%2==0?"sayi çifttir":"sayi tektir" :sayi<-100?"-100 den küçük negatif":"-100 den büyük ";
        System.out.println(sonuc);
    }
}
