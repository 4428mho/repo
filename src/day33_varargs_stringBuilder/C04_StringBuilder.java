package day33_varargs_stringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("cok        s güzel Java ");
        System.out.println(sb1.lastIndexOf("Java"));
        System.out.println(sb1.lastIndexOf("s"));
        System.out.println(sb1.replace(0,7,"yaşasın Java"));
        System.out.println(sb1.toString().toUpperCase());
        System.out.println(sb1.delete(8,12));
        System.out.println(sb1.deleteCharAt(3));

    }
}
