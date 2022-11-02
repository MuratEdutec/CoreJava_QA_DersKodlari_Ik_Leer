package ders07_NestedIfElseStatement;

public class C02_IfElseIFStatements {
    public static void main(String[] args) {

        //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        //Musteri karti varsa
        // 10 urunden fazla alirsa
        //%20, 10 urunden az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        // yoksa %10 indirim yapin


        int urunadedi = 9;
        boolean kartVarMi = false;
        double listeFiyati = 10;
        double toplamFiyat = 0;
        //uzun alti sari olunca simply yapilabilir

        if (urunadedi >= 10) {
            toplamFiyat = urunadedi * listeFiyati * (0.8);
            System.out.println("%20 indirimli toplam fiyat : " + toplamFiyat);
        }

       else if (kartVarMi && urunadedi < 10 && urunadedi > 0) {
            toplamFiyat = urunadedi * listeFiyati * (0.85);
            System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat);
        } else if (!kartVarMi && urunadedi > 10) {
            toplamFiyat = urunadedi * listeFiyati * (0.85);
            System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat);
        } else if (!kartVarMi && urunadedi < 10 && urunadedi > 0)
        {   toplamFiyat = urunadedi * listeFiyati * (0.90);
            System.out.println("%10 indirimli toplam fiyat : " + toplamFiyat);
        } else {
            System.out.println("Gecersiz giris");
        }


    }
}