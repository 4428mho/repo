package day33_varargs_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {
        int sayi=5;
        String str1="emine";
        String str2="aynur";
        String str3="rana";

        carpim(sayi,str1,str2,str3);

        int ramazan=30;
        boolean hilaliGörürsen=true;
        if (hilaliGörürsen){

            for (int i = 0; i <ramazan ; i++) {
                System.out.println("oruç tut");
            }
        }else {
            System.out.println("ikinci hilali gördun bayram yap");
        }
    }

    private static void carpim(int sayi, String... str) {
        String enUzunstr="";
        for (String each: str) {
            if (each.length()>enUzunstr.length()){
                enUzunstr=each;
            }

        }
        System.out.println("enUzun deger= " + sayi*enUzunstr.length());
    }
    }



