package stringBuilders_AccessModifier;

public class C04_AccessModifiers {


            String isim="Ali"; // acces modifier gorunmuyor, o zaman default access modifier gecerlidir
                            // bu class'dan ve der 29 package'i icerisindeki diger class'dan kullanilabilir

        // default int sayi=10; default access modifier yazilmaaz, YAZILAMAZ
           //                    yazmaya kalkisirsaniz java CTE verir/


    private static int sayi=10;


    public static void main(String[] args) {

        System.out.println(sayi);
        sayi=20;
        System.out.println(sayi);


    }
}
