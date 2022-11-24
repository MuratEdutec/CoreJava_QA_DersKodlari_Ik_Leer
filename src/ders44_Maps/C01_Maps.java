package ders44_Maps;

import java.util.Map;

public class C01_Maps {

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap= MapDepo.ornekMapOlustur();

        System.out.println(ogrenciMap);
       /* {101=Ali-Can-10-H-MF,
       102=Veli-Cem-11-M-Soz,
       103=Ali-Cem-11-H-TM,
       104=Ayse-Can-10-H-MF,
       105=Ayse-Cem-11-M-TM,
       106=Fatma-Han-10-K-Soz}
               */

        // 104 nolu ogrenci
        System.out.println(ogrenciMap.get(104)); // 104 degerindeki key'in value'sunun donduruyor

        // 105 nolu ogrencinin soyismini yazdiri

        int ogrenciKey=106;

        String isimSoyisim= MapDepo.isimSoyisimDondur(ogrenciMap, ogrenciKey);

        System.out.println(ogrenciKey+" nolu ogrenci isim soyismi --> "+isimSoyisim);












    }
}
