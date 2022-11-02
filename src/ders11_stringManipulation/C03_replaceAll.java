package ders11_stringManipulation;

public class C03_replaceAll {
    public static void main(String[] args) {

        String str="J1ava2 G9uzel5dir8";
        //str'daki metni silip metni Java Guzeldir haline donusturelim


        //str.replaceAll() sadece ir harf veya char squence'yi degil
        //genelleme ile soyleyebilecegimiz  ortak ozellikte tum karakterleri degistirir
        ///---System.out.println(str.replaceAll(str, "Java Guzeldir"));

        System.out.println(str.replaceAll("\\d", ""));
        System.out.println(str.replaceAll("\\D", ""));

        String s1= "Ilk urun fiyati     : 1250 tl";
        String s2= "ikinci urun fiyati  : 1500 tl";

        //iki urunun fiyatini toplayin
        s1=s1.replaceAll("\\D", "");
        s2=s2.replaceAll("\\D", "");
        System.out.println(s1 + s2);//12501500
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));

    }
}
