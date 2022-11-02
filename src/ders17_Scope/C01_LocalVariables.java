package ders17_Scope;

public class C01_LocalVariables {
    public static void main(String[] args) {
        // Bir method'un icerisinde olusturulan variable'larin scope'u
        // icinde olusturulduklari method'dur
        // o method'un disindan ULASILAMAZLAR


        int sayi=10;
        String isim="Ramazan";
        //System.out.println(dogruMu);

        for (int i = 0; i < 10; i++) {
            String adres="Ankara";

        // bir loop icerisinde olusturulan variable'lar sadece o loop icerisinde geceerlidir

        }
        // System.out.println(adres);
        double pi;

        // System.out.println(pi);


    }
    public static void method1(){
        //System.out.println(sayi);
        // isim="tugay";
        boolean dogruMu=true;

    }
}
