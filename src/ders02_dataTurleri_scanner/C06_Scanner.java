package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin iki kenar uuzunlugunu girin" +
                "iki kenar uzunlugu arasinda entar a basin");
    System.out.println("Lutfen dikdortgenin iki kenar uuzunlugunu girin" +
                "\n iki kenar uzunlugu arasinda entar a basin");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        System.out.println("dikdortgenin alani :  "+ (kenar1*kenar2));




    }
}
