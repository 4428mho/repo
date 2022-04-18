package day41_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileImputStream {
    public static void main(String[] args) {
        String dosyaYolu="src/day41_Exception/dosya";
        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
