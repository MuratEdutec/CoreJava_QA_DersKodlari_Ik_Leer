package ders10_stringManipulation;

public class C01_concetenation {
    public static void main(String[] args) {

        String str1= "Java";
        String  str2="Guzeldir";
        boolean bl= true;
        int sayi=20;
        double dbl= 3.54;


        System.out.println(str1+bl+sayi);
        //System.out.println(bl+sayi+str1); String disindaki data turlerinde toplama yapmamiza izin verir

        System.out.println(sayi+dbl);
           // concant () sadece String variable'lari birlestirmek icin kullanilir

        ////////////////System.out.println(str1.concat()+dbl);  TAM DEGILL



    }

}
