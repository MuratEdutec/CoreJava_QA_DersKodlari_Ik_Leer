package ders14_meethodOlusturma;

public class C04_Tekrar {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        // bu iki sayinin carpim sonucunu yeni kod yazmadan konsola yazdirin
        System.out.println(C01_Carpim.carpimMethodu(a, b));//200.0

        String c= "Nasil";
        String d= "Yaní";
        System.out.println(C02_StringConcate.birlestirMethodu(c, d)+C01_Carpim.carpimMethodu(a,b));

        String e="Bu da mi oldu? ";
        // e stringini tersten yazidrin
        System.out.println(C03_StringTerseCevirme.stringiTersCevir(e));

        //"Bu cumleyi terse cevirin"
        System.out.println(C03_StringTerseCevirme.stringiTersCevir("Bu cumleyi terse cevirin"));

    }
}
