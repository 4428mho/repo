package day11_SwichMevsimler;

public class C04_CharAt {
    public static void main(String[] args) {
        String str= "java cok güzel";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(9));
        System.out.println(""+str.charAt(2)+str.charAt(3));

        System.out.println(str.toLowerCase().charAt(5)+""+str.toUpperCase().charAt(6)+
                str.toUpperCase().charAt(7));
        System.out.println(str.charAt(14-1));
        System.out.println(str.charAt(14));

    }
}
