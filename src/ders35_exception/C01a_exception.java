package ders35_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01a_exception {

    public static void main(String[] args) {

        // kullanicidan bir tamsayi alin
        // ve sayinin karesini yazdirin
        // kullanici ondalikli sayi girerse kullanaciya uyari yazisi yazdorop
        // tekrar sayi isteyin

        sayiAlKaresiniYazdir();
    }

    public static void sayiAlKaresiniYazdir(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");



        try {
            int girilenSayi = scan.nextInt();
            /*
            Eger ondalikli sayi girilirse  26.satir exception verecek ve
            catch bloguna kadar olan diger kodlar calismayacak
            catch blogu hata yakalandiginda ne yapmasini istedigimizi soyledigimiz bolumdur

            bu soruda istenen exception olustugunda yeniden deger istenmesi
            bizde exception olustugunda yeniden method'u calistirdik
             */
            System.out.print("Girdiginiz sayinin karesi : ");
            System.out.println(girilenSayi*girilenSayi);



        } catch (InputMismatchException e) {
            System.out.println("Sana tam sayi degeri gir dedik :) ");
            sayiAlKaresiniYazdir();

        }
    }
}
