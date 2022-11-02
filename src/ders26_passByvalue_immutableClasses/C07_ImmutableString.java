package ders26_passByvalue_immutableClasses;

public class C07_ImmutableString {
    public static void main(String[] args) {



        String str= "Java Candir";
        str= str.toUpperCase();
        System.out.println(str);

        /*
            Immuteable class'lardan olusturulan bir objenin degerin DEGISTIRILEMEZ
            Eger atama yaparsak java degerini degistirmez
            bunun yerine yeni bir obje olusturur,
            ve bu yeni objeye yeni atadigimiz degeri atat

            eski obje bosa cikar ve garbage collector tarafindan silinmeyi bekler
         */
    }
}
