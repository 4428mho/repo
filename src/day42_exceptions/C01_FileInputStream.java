package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream {
    public static void main(String[] args) {

        int sayı=10;
       //  String str =sayı;  CTE error.

       // Object sayı2=20;
       // String str2=(String)sayı2; ClassCastException


    String dosyaYolu = "src/day41_Exception/dosya";
    FileInputStream fis;

    {
        try {
            fis = new FileInputStream(dosyaYolu);
            int k =0;
            while ((k=fis.read())!=-1){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}}
