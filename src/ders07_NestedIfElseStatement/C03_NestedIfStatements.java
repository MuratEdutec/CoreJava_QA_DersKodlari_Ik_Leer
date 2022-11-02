package ders07_NestedIfElseStatement;

import java.sql.SQLOutput;

public class C03_NestedIfStatements {
    public static void main(String[] args) {

        /*Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri ,
        Erkek 65 yas ve uzeri emekli olabilir.
       Cinsiyet ve yasini dikkate alarak
       “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.*/

        char cinsiyet='e';
        int yas=16;
        //nested if-else seklinde kullanim icin once ana degiskeni secip
        //ona gore ana yapiyi olusturalim
        //cinsiyet ana degisken

        if (cinsiyet=='K' || cinsiyet=='k') {
            if (yas<15) {
                System.out.println("Hatali yas girisi");

            }else if(yas<60) {
                System.out.println("Emekli olmazsin, daha " + (60 - yas) + " yil calsimalisini");
            }else {
                System.out.println("Emekli olabilirsiniz");
            }



        }else if(cinsiyet=='E' || cinsiyet=='e') {
            if (yas<15) {
                System.out.println("Hatali yas girisi");

            }else if(yas<65) {
                System.out.println("Emekli olmazsin, daha " + (65 - yas) + " yil calsimalisini");
            }else {
                System.out.println("Emekli olabilirsiniz");
            }



       }else

    {
        System.out.println("Yanlis cinsiyet girisi ");
    }




















    }
}
