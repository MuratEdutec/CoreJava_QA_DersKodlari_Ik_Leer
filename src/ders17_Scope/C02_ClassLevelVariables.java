package ders17_Scope;

public class C02_ClassLevelVariables {

    // class kevel variable'lar method'larin disinda olusturulur
    // genel kullanim en ustte olusturulmalidir

    static String hastaneIsmi="Yildiz Hastanesi";
    static int hastaSayisi=23453;
    static  String basHekimIsmi; // null yerine "Isim girilmedi"  "Telefon girilmedi"
    String persIsmi="Isim Girilmesi";
    String persTelefonu="Telefon Girilmedi";
    int persYasi;



    public static void main(String[] args) {
        System.out.println(hastaneIsmi);
        System.out.println(basHekimIsmi);
        // System.out.println(persIsmi);// static olmadigi icin static main method'dan kullanilamaz

        /*
        Class level variable'lara deger atamasi yapilmamis olursa
        Java bu variable'lara data turune gore
        default olarak tanimlanan degerler atar
        default degerler..:
        sayisal variable'lar icin :0
        boolean : false
        char : ''
        Objeler (String dahil) : null
         */
        method1();

    }

    public static void method1(){
        System.out.println(hastaSayisi);
        hastaSayisi++;
        System.out.println(hastaSayisi);

        // System.out.println(persIsmi);


    }
    public void method2(){
        System.out.println(hastaneIsmi);
        hastaSayisi++;
        System.out.println(persIsmi);
        System.out.println(persYasi);

    }

}
