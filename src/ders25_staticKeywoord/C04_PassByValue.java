package ders25_staticKeywoord;

public class C04_PassByValue {
    public static void main(String[] args) {
        double fiyat=100;

        System.out.println(indirimuygula(fiyat)); // 90

        System.out.println(fiyat); //100

    }
    public static double indirimuygula(double fiyat){
        // %10 indirim yapsin

        fiyat= fiyat * 0.90;// fiyata atama yaptik kalici olarak 90 oldu

        return fiyat;



    }

}
