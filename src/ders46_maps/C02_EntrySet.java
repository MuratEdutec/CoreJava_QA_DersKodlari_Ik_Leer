package ders46_maps;

import ders44_Maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {
        // Ogrenci map'indeki sirali olarak
        // tum ogrencilerin
        // bolum, sinif, sube, isim, soyisim ve numaralarini yazdirin

        Map<Integer, String> ogrenciMap= MapDepo.ornekMapOlustur();
        Set<Map.Entry<Integer,String>> ogrenciEntrySeti = ogrenciMap.entrySet();






























    }
}
