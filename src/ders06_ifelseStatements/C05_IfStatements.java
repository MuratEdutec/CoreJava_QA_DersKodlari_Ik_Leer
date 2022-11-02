package ders06_ifelseStatements;

import java.util.Scanner;

public class C05_IfStatements {

    public static void main(String[] args) {

        //Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
        //yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

     Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");

        double yas=scan.nextDouble();

        if( yas>=65){
            System.out.println("Yaşınız Emeklilik İçin Yeterli");
        }else {
            System.out.println("Emekli olmak icin --> " + (65-yas)+" <-- sene daha calismalisin");
        }
























    }
}
