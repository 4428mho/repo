package day41_Exception;

public class C01 {
    public static void main(String[] args) {


    int a=10;
    int b=0;
    int c=0;
        try {
            c=a/b;
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("c = " + c);
    }
}
