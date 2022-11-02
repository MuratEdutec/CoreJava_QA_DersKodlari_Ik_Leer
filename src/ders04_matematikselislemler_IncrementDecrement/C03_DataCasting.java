package ders04_matematikselislemler_IncrementDecrement;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        // kullanicidan iki int deger alip
        // bunlari birbirine bolun ve sonucu double olarak yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 2 tam sayi giriniz");


        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        double ondalikliSayi= (double) (sayi1/sayi2);// (double)(3)==> 3.0

        System.out.println(ondalikliSayi);//3.0

        //double dogruSonuc=(double) sayi1/sayi2;
        //HERHANGI BIRININ ONUNDE DOUBLE____
        double dogruSonuc= sayi1/(double) sayi2;
        System.out.println(dogruSonuc);





    }


}
