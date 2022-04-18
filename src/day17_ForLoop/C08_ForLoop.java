package day17_ForLoop;

public class C08_ForLoop {
    public static void main(String[] args) {
        String input="madam";
        palidromeKontrolEt(input);

    }

    private static void palidromeKontrolEt(String input) {
        String terstenImput="";
        for (int i = input.length()-1; i>=0 ; i--) {
            terstenImput+=input.charAt(i);
        }
        System.out.println("tersi = " + terstenImput);
        if(input.equals(terstenImput)){
        System.out.println("palidrom");}
        else{
        System.out.println("değil");}
    }
}
