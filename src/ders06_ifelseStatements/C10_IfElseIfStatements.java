package ders06_ifelseStatements;

public class C10_IfElseIfStatements {
    public static void main(String[] args) {

        /*Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri ,
        Erkek 65 yas ve uzeri emekli olabilir.
       Cinsiyet ve yasini dikkate alarak
       “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.*/

        char cinsiyet='E';
        int yas=15;
        if (cinsiyet == 'E' && yas>=65) {
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet=='E' && yas<65 && yas>15) {
            System.out.println("Emekli olmak icin daha  "+ (65-yas)+ " sene daha calismalisiniz");

        } else if(cinsiyet == 'K' && yas>=60) {
            System.out.println("Emekli olabilirsin");
        } else if (cinsiyet=='K' && yas<60 && yas>15)  {
            System.out.println("Emekli olmak icin daha  "+ (60-yas)+ " sene daha calismalisiniz");

        } else {
            System.out.println("gecersiz giris");

        }


    }
}
