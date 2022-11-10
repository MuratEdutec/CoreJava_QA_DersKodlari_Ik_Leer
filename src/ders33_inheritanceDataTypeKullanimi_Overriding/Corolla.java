package ders33_inheritanceDataTypeKullanimi_Overriding;

public class Corolla extends BToyota{

    String model="Corolla";
    String uretimYeri="Türkiye";
    int yil=2023;

    public static void main(String[] args) {

        /*
        Bir obje olusturulurken
        data turu ve constructor ayni class'dan ise
        bir VARIABLE'in degerinin bulmak icin
        o class'a gideriz
        o class'da yok ise sirasiyla parent class'lara bakilir
        ilk bulunan kullanilir
         */
        System.out.println("-----------corolla1 --------------------------------------");

        Corolla corolla1=new Corolla();
        // once kendi class'i sonra bir uste gecer
        System.out.println(corolla1.model); // class--> Corolla
        System.out.println(corolla1.uretimYeri);// class--> Corolla
        System.out.println(corolla1.yil);// class--> Corolla
        System.out.println(corolla1.marka);// class--> BToyota
        System.out.println(corolla1.motor);// class--> Araba
        System.out.println(corolla1.plaka);// class--> Araba
        System.out.println(corolla1.yakit);// class--> BToyota


        System.out.println("-----------corolla2 --------------------------------------");

        BToyota corolla2=new Corolla();
        /*
        Obje olusturulurken
        data turu ve constructor darkli ise
        VARIABLE'in degerini bulmak icin
        Data turu olan class'a gidilir
        varsa kullanilir, yoksa o class'in parent'larina bakilir
        bulunamazsa CTE verir
        (ama geri vites yapmaz)==>> bir alta gitmezzz
         */
        System.out.println(corolla2.model); // class--> BToyota
        //System.out.println(corolla2.uretimYeri);// CTE
        System.out.println(corolla2.yil);// class--> BToyota
        System.out.println(corolla2.marka);// class--> BToyota
        System.out.println(corolla2.motor);// class--> Araba
        System.out.println(corolla2.plaka);// class--> Araba
        System.out.println(corolla2.yakit);// class--> BToyota





        Araba corolla3=new Corolla();
        System.out.println("-----------corolla3 --------------------------------------");
        //System.out.println(corolla3.model); // CTE
        //System.out.println(corolla3.uretimYeri);// CTE
        //System.out.println(corolla3.yil);// CTE
        //System.out.println(corolla3.marka);// CTE
        System.out.println(corolla3.motor);// class--> Araba
        System.out.println(corolla3.plaka);// class--> Araba
        System.out.println(corolla3.yakit);// class--> Araba



        System.out.println("-----------toyota1 --------------------------------------");


        BToyota toyota1= new BToyota();
        System.out.println(toyota1.marka);// BToyota
        System.out.println(toyota1.model);// BToyota
        System.out.println(toyota1.motor);// Araba
        System.out.println(toyota1.plaka);//Araba
        System.out.println(toyota1.yakit);// BToyota
        System.out.println(toyota1.yil);// BToyota

        System.out.println("-----------toyota2 --------------------------------------");

        Araba toyota2= new BToyota();

        //System.out.println(toyota2.marka);// CTE
        //System.out.println(toyota2.model);// CTE
        System.out.println(toyota2.motor);// Araba
        System.out.println(toyota2.plaka);//Araba
        System.out.println(toyota2.yakit);// BToyota
        //System.out.println(toyota2.yil);// CTE


        System.out.println("-----------araba1 --------------------------------------");

        Araba araba1= new Araba();

        System.out.println(araba1.motor);
        System.out.println(araba1.plaka);
        System.out.println(araba1.yakit);


    }

}
