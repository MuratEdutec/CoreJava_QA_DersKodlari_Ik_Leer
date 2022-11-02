package ders24_constructors;

public class Araba {

    String marka = "Marka belirtilmedi";
    String model = "Model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    public Araba(String marka, String model, String yakit, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yakit = yakit;
        this.yil = yil;
        this.fiyat = fiyat;
    }

   public Araba (String mrk, String mdl){
        marka=mrk;
        model=mdl;
    }


    public Araba(){

    }


    public String toString() {
        return "Araba Ozellikleri" +
                "\nMarka        : " + marka +
                "\t\tModel      : " + model +
                "\nYakit        : " + yakit +
                "\nYil          : " + yil +
                "\t\t\tFiyat    : " + fiyat;
    }
}
