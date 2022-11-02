package ders24_constructors;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1= new Araba();

        arb1.marka= "Citroen";
        arb1.model= "C3";
        arb1.yakit= "Benzin";
        arb1.yil= 2020;
        arb1.fiyat= 20000;

        System.out.println(arb1);

        Araba arb2= new Araba("volvo","CX60");

        System.out.println(arb2);


        Araba arb3= new Araba("Hyundai","i10","benzin",10000,2022);
        System.out.println(arb3);





    }
}
