package ders37_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_CheckedExceptions {
    public static void main(String[] args) {
        String dosyaYolu="src/ders36_checkedExceptions/Deneme.txt";
        int k=0;

        try {
            FileInputStream fis= new FileInputStream(dosyaYolu);

            while ((k=fis.read())!=-1){
                System.out.print((char)k);
            }


        } catch (FileNotFoundException e) {

            System.out.println("Dosya yolu yanlis veya dosya arizali");
        } catch (IOException e) {
            System.out.println("Dosya okuma veya yazma ile ilgili bir sorun var");
        }
    }

}
