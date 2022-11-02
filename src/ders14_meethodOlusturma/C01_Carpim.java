package ders14_meethodOlusturma;

import java.util.Scanner;

public class C01_Carpim {

    //main method icerisinde kullanicidan iki sayi alin
    //bu iki sayiyi parametre oalrak kabul edip, carpimlarini bize donduren bir method olusturalim


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double sayi1 = scan.nextDouble();//5
        double sayi2 = scan.nextDouble();//3

        //System.out.println(carpimMethodu(3.4, 5));//15
        System.out.println(carpimMethodu(sayi1, sayi2));//17.0

        double carpimSonucu=carpimMethodu(6,2);//12.0

    }

// olusturacagimiz methodlar main method disinda yapilir

    public static double carpimMethodu(double sayi1, double sayi2) {
        System.out.println("carpim method'u calisti ");
        return sayi1*sayi2;

    }


}

