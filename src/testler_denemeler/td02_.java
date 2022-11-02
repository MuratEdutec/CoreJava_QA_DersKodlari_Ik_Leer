package testler_denemeler;

import java.awt.desktop.AboutEvent;
import java.util.Scanner;

public class td02_ {
    public static void main(String[] args) {

         /*Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri ,
        Erkek 65 yas ve uzeri emekli olabilir.
       Cinsiyet ve yasini dikkate alarak
       “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.*/

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen cinisyet giriniz");
        char cinsiyet=scan.next().charAt(0);
        System.out.println("Lutfen yas girin");
        double yas=scan.nextInt();

        //blok 1
        if(cinsiyet=='K' || cinsiyet=='k') {
            if (yas < 15) {
                System.out.println("Hatali yas girisi");
            } else if (yas < 60) {
                System.out.println("Emekli olmaniz icin " + (60 - yas) + " yil daha calis");

            } else {
                System.out.println("Emekli olabilirsiniz");
            }
        //blok 2
        } else if (cinsiyet=='e' || cinsiyet=='E') {
            if (yas < 15) {
                System.out.println("Hatali yas girisi");
            } else if (yas < 65) {
                System.out.println("Emekli olmaniz icin " + (65 - yas) + " yil daha calis");

            } else {
                System.out.println("Emekli olabilirsiniz");
            }
       //blok3
        }else {
            System.out.println("Hatali cinsiyet girisi");
        }

        //==================
    }
}
