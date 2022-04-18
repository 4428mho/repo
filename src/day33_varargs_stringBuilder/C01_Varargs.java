package day33_varargs_stringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="Veli";
        String str3="Muhammet";

        enUzunKelime(str1,str2,str3);
    }

    private static void enUzunKelime(String... str) {

        String enUzunstr="";
        for (String each: str) {
            if (each.length()>enUzunstr.length()){
                enUzunstr=each;
            }

        }
        System.out.println("enUzunstr = " + enUzunstr);
    }
}
