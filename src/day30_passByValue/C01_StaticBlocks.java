package day30_passByValue;

import day29_staticKeyword.C01_Static;

public class C01_StaticBlocks {
    static {
        System.out.println("blok çalıştı");
    }
C01_StaticBlocks(){
    System.out.println("constructor çalıştı");
}
    public static void main(String[] args) {
        System.out.println("main method başlangıcı");
        C01_StaticBlocks obj;
        new C01_StaticBlocks();
    }
}
