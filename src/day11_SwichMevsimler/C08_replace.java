package day11_SwichMevsimler;

public class C08_replace {
    public static void main(String[] args) {
        String str="bugun çok iyi geçmedi";
        System.out.println("boşluk olmadan önceki karakter sayısı : "+ str.replace(" ","").length());
        System.out.println("orjinal sayı : "+str.length());

        str=str.replace("geçmedi","geçti");
        str=str.replace("bugun","dun");
        System.out.println("kalıcı cümle : "+str);
    }
}
