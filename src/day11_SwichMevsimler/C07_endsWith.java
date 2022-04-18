package day11_SwichMevsimler;

public class C07_endsWith {
    public static void main(String[] args) {
        String email="muhansayy@gmail.com.tr";
        String arananMetin= "@gmail.com";

        if (!email.contains(arananMetin)){
            System.out.println("lütfen email adreini giriniz");
        }else if(email.endsWith(arananMetin)){
            System.out.println("email adresiniz kaydedildi");
        }else {
            System.out.println("yazımı kontrol ediniz");
        }
    }
}
