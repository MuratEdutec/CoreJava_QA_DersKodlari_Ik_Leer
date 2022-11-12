package ders35_exception;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class C04_TryCatch {
    public static void main(String[] args) {


        //kullanicidan istedigi kadar sayi girmesinin isteyip
        //girilen sayilari toplayin
        // kullanicinin islemi bitirmek icin Q' ya basmasini isteyin
        //Q'ya basildiginda toplam kac sayi girdigini
        // ve bu sayilarin toplaminin kac oldugunu yazdirin

        Scanner scan=new Scanner(System.in);

        double girilenSayi= 0;
        double sayilarinToplami= 0;
        int sayac=0;
        boolean devam=true;

        while (devam){

            System.out.println("Toplanmak uzere sayi giriniz. BItirmek icin Q'ya basiniz ");


            try {
                girilenSayi=scan.nextDouble();
                sayilarinToplami+= girilenSayi;
                sayac++;

            } catch (InputMismatchException hata) {
               //break;

                String str= scan.next();
                if (str.equalsIgnoreCase("Q")){
                    break;
                }
            }
        }

        System.out.println("Toplam " + sayac + " adet sayinin toplami -->  " + sayilarinToplami);

    }
}
