package ders17_Scope;

public class C03_ObjectVariables {


    static String hastaneIsmi="Yildiz Hastanesi";
    static int hastaSayisi=23453;
    static  String basHekimIsmi; // null yerine "Isim girilmedi"  "Telefon girilmedi"
    String persIsmi="Isim Girilmedi";
    String persTelefonu="Telefon Girilmedi";
    int persYasi;

    /*
        Class level variable'larin scope'u tum class'dir
        Static kelimesi ile isaretlenen variable'lara
        class icersinden heryerden ulasilabildigi icin diger adi class variables'dir.

        Static kelimesi ile isaretlenmeyen variable'lara ise instance variable denir.
        Instance variable'lar objelere bagli olduklarindan
        bu variable'larin diger adi object variables'dir
     */


    public static void main(String[] args) {







    }

}
