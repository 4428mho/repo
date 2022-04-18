package day07_matematikselislemler;

public class C01_PreincremenPostincrement {
    public static void main(String[] args) {
        int sayi=10;
        sayi++;
        System.out.println(sayi);
        sayi++;
        System.out.println(sayi);
        sayi++;
        System.out.println(sayi);
        sayi++;
        System.out.println("pre-incrementten önce  " + sayi);
        System.out.println("pre-increment satırında  " + ++sayi);
        System.out.println("pre-incrementden sonra  " + sayi);

        System.out.println("post-increment satırında  " + sayi++);
        System.out.println("post-increment satırından sonra  " + sayi);
    }
}
