package ders30_encapsulation;

public class AEncapsuleClass {
    public void setHastaUcreti(int hastaUcreti) {
        this.hastaUcreti = hastaUcreti;
    }

    public int HastaUcreti() {
        return hastaUcreti;
    }

    public String getHastaneIsmi() {
        return hastaneIsmi;
    }

    private String hastaneIsmi="Yidiz Hastanesi";
    // hastane ismi gorulebilsin ama degistirilmesi


    private int hastaUcreti;
    // hasta ucretleri de giris yapilabilsin ama
    // ucreti sigortadan alinacagi icin
    // personel hasta ucretlerini gormesin

    private String hemsireIsmi;
    private String hemsireAdresi;
    // bu instance variable'lara herkes ulasabilsin
    // bu durumda public yapmak akla gelen ilk cozum olacaktir
    // bu variable'leri public yapmak yerine getter ve setter olusturmakta ayni islevi gorur


    public String getHemsireIsmi() {
        return hemsireIsmi;
    }

    public void setHemsireIsmi(String hemsireIsmi) {
        this.hemsireIsmi = hemsireIsmi;
    }

    public String getHemsireAdresi() {
        return hemsireAdresi;
    }

    public void setHemsireAdresi(String hemsireAdresi) {
        this.hemsireAdresi = hemsireAdresi;
    }
}
