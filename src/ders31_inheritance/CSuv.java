package ders31_inheritance;

public class CSuv extends BinekArac {

    //* HEPSINI YAZDIRMAK ICIN TO STRING METHODU KULLANIYORUZ


    @Override
    public String toString() {
        return "CSuv{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", motor='" + motor + '\'' +
                ", plaka='" + plaka + '\'' +
                ", yakit='" + yakit + '\'' +
                '}';
    }

    public static void main(String[] args) {


        CSuv suv1 = new CSuv();
        System.out.println(suv1.marka); //  Binek araclarin markasi vardir";
        System.out.println(suv1.model); //  Binek araclarin modeli olur";
        System.out.println(suv1.motor); //  Tum araclar motor kullanir
        System.out.println(suv1.plaka); //  Tum araclarin plakasi olur
        System.out.println(suv1.yakit); //  Araclar farkli yakitlar kullanilir
        System.out.println(suv1.yil);   //  1900
        suv1.hiz("benzin");                     //  binek araclarin hizi modele gore desisir
        suv1.teker();                   //  binek araclarin 4 tekeri olur


        CSuv suv2 = new CSuv();
        suv2.marka = "Toyota";
        suv2.model = "RAV4";
        suv2.motor = "1.6";
        suv2.plaka = "Jkdx00";
        suv2.yakit = "benzin";
        suv2.yil = 2012;
        suv2.hiz(suv2.yakit);
        System.out.println(suv2);


    }

    public void hiz(String yakit) {
        if (yakit.equalsIgnoreCase("benzin")) {
            System.out.println("Benzinli SUV'lar max 300km yapar");
        } else if (yakit.equalsIgnoreCase("dizel")) {
            System.out.println("Dizel SUV'lar max 240km yapar");
        } else if (yakit.equalsIgnoreCase("hibrit")) {
            System.out.println("Dizel SUV'lar max 220km yapar");
        } else {
            System.out.println("Yakit belirtilmemis, max hiz soyleyemem");
        }

    }
}