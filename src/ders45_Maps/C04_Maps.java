package ders45_Maps;

import ders44_Maps.MapDepo;

import java.util.List;
import java.util.Map;

public class C04_Maps {
    // Ogrenci map'inde numarasi verilen sayilarin arasinda (sinirlar dahil) olan ogrencilerin
    // Isim soyisim ve bolumlerini list olarak bize donduren bir method olusturun

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap=MapDepo.ornekMapOlustur();

        ogrenciMap.put(107,"Tugay-Cil-12-K-MF");
        ogrenciMap.put(103,"Hikmet-Saglam-11-K-Soz");
        int basNo= 102;
        int bitNo= 120;
        List<String> isimListesi= MapDepo.numaraDegerineGoreListe(ogrenciMap, basNo, bitNo);
        System.out.println(isimListesi);











    }

}
