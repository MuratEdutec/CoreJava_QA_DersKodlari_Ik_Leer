package ders23_constructors;

import java.sql.SQLOutput;

public class DArabaRunner {
    public static void main(String[] args) {

        // DAraba class'indan bir obje olusturalim



        DAraba arb1= new DAraba();

        System.out.println(arb1.marka);// Marka belirtilmedi
        System.out.println(arb1.model);// Maodel belirtilmedi
        System.out.println(arb1.yakit);// null
        System.out.println(arb1.yil); //   0
        System.out.println(arb1.fiyat); // 0

        arb1.marka = "Tofas";
        arb1.model = "Kartal";
        arb1.yakit = "Benzin";
        arb1.fiyat =50000;
        arb1.yil =1991;
        arb1.maxHiz(arb1.yakit);



        System.out.println(arb1.marka);// Marka belirtilmedi
        System.out.println(arb1.model);// Maodel belirtilmedi
        System.out.println(arb1.yakit);// null
        System.out.println(arb1.yil); //   0
        System.out.println(arb1.fiyat); // 0
        System.out.println(arb1.maxHiz(arb1.yakit)); // 0

        DAraba arb2= new DAraba();

        // arb2'nin ozelliklerini yazdirmak istersek
        System.out.println( "Marka  : " + arb2.marka +
                            "\nModel  : " + arb2.model +
                            "\nYakit  : " + arb2.yakit +
                            "\nYil    : " + arb2.yil +
                            "\nMarka  : " + arb2.fiyat);

        DAraba arb3= new DAraba();

        System.out.println(arb3);
        System.out.println(arb1);

        DAraba arb4= new DAraba();
        System.out.println(arb4);


    }
}
