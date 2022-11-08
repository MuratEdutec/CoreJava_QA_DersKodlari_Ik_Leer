package ders31_inheritance;

public class GCorolla extends FToyota{


    String model="Corolla";
    String uretimYeri="Turkiye";
    GCorolla(){
        super();
        System.out.println("Corolla cons. calisti");
    }
    public static void main(String[] args) {

        GCorolla corolla1=new GCorolla();
        System.out.println(corolla1.marka);// Toyota

        /*
        Bir child class'dan obje olusturdugumuzda
        olusturulan obje sadece child class'a ait ozellikleri degil
        tum parent class'larindaki ozellikleri tasir

        Bir objenin bir class'in ozelliklerini tasimasi icin
        o obje olusuturlurken class'a ait constructor'in calismis olmasi gerekir
        Yani child class'indak' obje olusuturlurken
        tum parent class'lardaki constructor'lar da otomatik olarak calisir

        Java bu islem icin soyle bir mekanizma gelistirmistir:
        Bir class olusturdugumuzda biz constructor olusturmasakta
        Java'nin o class'a default constructor koydugu GIBI
        extends keyword kullanan bir class'da olusturulan her bir constructor'in
        ilk satirini biz gormesekte super() constructor call koyar
         */

    }
}
