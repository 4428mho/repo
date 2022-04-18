package day42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException extends Throwable {
    public static void main(String[] args) throws IllegalAccessException, C03_IllegalArgumentException {

    Scanner scsn=new Scanner(System.in);
        System.out.println(" lutfen yaşınızı giriniz");
    int yas=scsn.nextInt();

    if(yas<=0||yas>120) {
        //System.out.println("olmadı");}
        throw new C03_IllegalArgumentException();
    }
    else {
        System.out.println("oldu");
    }
    }
}
