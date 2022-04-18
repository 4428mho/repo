package day33_varargs_stringBuilder;

public class C06_StringBuilder {
    public static void main(String[] args) {


        StringBuilder sb2=new StringBuilder("Prize Dikkat");
        System.out.println(sb2.insert(12," Edin."));
        String str="Ben Bu hayatın.........";
        System.out.println(sb2.insert(0,str,0,7));
        System.out.println(sb2.reverse());

    }
}
