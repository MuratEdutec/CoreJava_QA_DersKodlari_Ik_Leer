package ders45_Maps;

import ders44_Maps.MapDepo;

import java.util.List;
import java.util.Map;

public class C04_Maps {
    // Ogrenci map'inde numarasi verilen sayilarin arasinda (sinirlar dahil) olan ogrencilerin
    // Isim soyisim ve bolumlerini list olarak bize donduren bir method olusturun

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap=MapDepo.ornekMapOlustur();

        int basNo= 103;
        int bitNo=107;
        List<String> isimListesi= MapDepo.numaraDegerineGoreListe(ogrenciMap, basNo, bitNo);
        System.out.println(isimListesi);











    }

}
