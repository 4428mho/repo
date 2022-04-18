package day17_ForLoop;

public class C07_ForLoop {
    public static void main(String[] args) {

        int sayi=60;
        for (int i = 1; i <=60 ; i++) {

            if (i%3==0&&!(i%5==0)){
                System.out.println("java");
            }else if (i%5==0&&!(i%3==0)){
                System.out.println("güzeldir");
            }else if(i%3==0&&i%5==0){
                System.out.println("java güzeldir");
            }else {
                System.out.println(i);
            }

        }

    }
}
