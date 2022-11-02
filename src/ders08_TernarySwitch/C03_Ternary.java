package ders08_TernarySwitch;

public class C03_Ternary {
    public static void main(String[] args) {
        int a= 5;

        /*
        ternary operatoru tek basina kullanilamaz
        ternary bize bir sonuc uretir
        bu sonucu ya direk yazdirmali veya bir variable'a atamaliyiz

         */
        String sonuc= a%2==0 ? "cift sayi" : "tek sayi";
        /*
        ternary'nin sonucunu bir variable'ea atayacaksak
        true ve false durumlarinda uretilecek sonucun
        ayni data turune uygun olmasi gerekir
        aksi halde CTE olusur.
        CTE--> compile time error

        Ama ternary'i sout icinde kullanirsak sonuclarin data turunun olmasi sart olmaz

        TERNARY  yaz yazdirilmali (sout) yada variable'a atanmali
         */



        String sonuc2=a>10 ? "buyuk sayi" : ""+2*a;// CTE vermemesi icin String'e cevirdik
        System.out.println(sonuc2);
        System.out.println(a>10 ? "buyuk sayi" :2*a);

    }
}
