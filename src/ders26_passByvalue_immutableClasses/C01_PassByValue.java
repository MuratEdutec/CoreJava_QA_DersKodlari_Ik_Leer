package ders26_passByvalue_immutableClasses;

public class C01_PassByValue {
    public static void main(String[] args) {
        double fiyat=100;

        System.out.println(indirimuygula(fiyat)); // 90
       // System.out.println(indirimuygula(fiyat)); // 90
//        System.out.println(indirimuygula(fiyat)); // 90
        System.out.println(fiyat); //100

        fiyat=indirimuygula(fiyat);

        System.out.println("indirim uygulanmsi yeni fiya"+ fiyat);
    }

    /*
    Kodlarimizin anlasilabilir olmasi icin main method'dan diger methodlara
    parametre olarak gonderdigimiz variable'lar icin ayni isimli variable olusturmayi TERCIH EDERIZ.

    JAVA method'lar arasinda gecis yaparken variable'i degil
    variable'in value'sunu pas eder

    Bu Java'nin Pass By Value'yu tercih etmesinden kaynaklaniyor
    Eger method'un icersinde yaptiginiz degisikligin
    main method icin de gecerli olmasini isterseniz
    main method icersinden

        fiyat=indirimuygula(fiyat);
    atamasini yapabiliriz.
     */
    public static double indirimuygula(double fiyat){
        // %10 indirim yapsin

        fiyat= fiyat * 0.90;// fiyata atama yaptik kalici olarak 90 oldu

        return fiyat;



    }
}

