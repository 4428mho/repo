package day31_immutableClasses;

import java.time.LocalDateTime;

public class C01_Equals {
    public static void main(String[] args) {
        String a="";
        a+=2;
        a+='c';
        a+=false;
        if (a=="2cfalse"){
            System.out.println("==");
        }if (a.equals("2cfalse")){
            System.out.println("equals");
        }
    }
}
