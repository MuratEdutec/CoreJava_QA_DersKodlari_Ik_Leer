package ders08_TernarySwitch;

public class C05_Ternary {
    public static void main(String[] args) {
       // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        int kenar1=0;
        int kenar2=0;
        int kenar3=0;

        System.out.println(kenar1==kenar2 && kenar2==kenar3 ? "Eskenar ucgen" : "Eskenar ucgen degil");

        //Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        int sayi1=90;
        int sayi2=10;

        System.out.println(sayi1>sayi2 ? sayi2 : sayi1 );
    }
}
