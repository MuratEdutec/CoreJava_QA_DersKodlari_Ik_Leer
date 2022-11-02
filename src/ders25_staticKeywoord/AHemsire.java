package ders25_staticKeywoord;

public class AHemsire { // depo class

    static String hastaneIsmi   ="Yildiz Hastanesi";
    static String hastaneAdresi ="Cankaya/Ankara";
    static String bashekimIsmi  = "Dr Mehmet Yilmaz";

    String personelIsim= "Isim Belirtilmedi";
    String personelAdresi= "Adres Belirtilmedi";
    String PersonelTelefon= "Tel Belirtilmedi";



    public String toString() {
        return "AHemsire->"+
                "personelIsim= " + personelIsim +"->"+
                "personelAdresi= " + personelAdresi+"->"+
                "PersonelTelefon= " + PersonelTelefon+"->"+
                "hastaneIsmi= " + hastaneIsmi +"->"+
                "hastaneAdresi= " + hastaneAdresi+"->"+
                "bashekimIsmi= " + bashekimIsmi;
    }
}
