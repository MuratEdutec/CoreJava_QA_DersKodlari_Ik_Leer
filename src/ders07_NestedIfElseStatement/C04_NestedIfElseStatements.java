package ders07_NestedIfElseStatement;

import java.util.Scanner;

public class C04_NestedIfElseStatements {
    public static void main(String[] args) {

             /*Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri ,
        Erkek 65 yas ve uzeri emekli olabilir.
       Cinsiyet ve yasini dikkate alarak
       “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.*/

        //ana degisken YAS

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        double yas=scan.nextDouble();
        System.out.println("Lutfen cinsiyeti giriniz E/K");
        char cinsiyet=scan.next().charAt(0);


        if (yas<15) {
            System.out.println("Hatali yas giris");



        } else if(yas<60) {
            //emekli olamaz gereken sure cinsiyete bagli
            System.out.println("Emekli olamazsin");
            if (cinsiyet=='K'|| cinsiyet=='k') {
                System.out.println("Daha "+ (60-yas)+" sene calismalisin");
            } else if (cinsiyet=='E'|| cinsiyet=='e') {
                System.out.println("Daha "+ (65-yas)+" sene calismalisin");
            }else{
                System.out.println("Hatali cinsiyet girisi");
            }


        } else if (yas<65) {
            //kadin ise emekli olabilir, erkek calismasi lazim

            if (cinsiyet=='K'|| cinsiyet=='k') {
                System.out.println("Emekli olabilirsin");
            }else if (cinsiyet=='E'|| cinsiyet=='e') {
                System.out.println("Daha " + (65 - yas) + " sene calismalisin");
            }else{
                System.out.println("Hatali cinsiyet girisi");
            }



        }else {
            System.out.println("Emekli Olabilirsiniz");

        }





        //bunlari elleme ---------------------------------------------

    }
}
