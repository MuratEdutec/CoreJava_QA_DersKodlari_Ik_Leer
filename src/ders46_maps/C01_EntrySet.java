package ders46_maps;
import ders44_Maps.MapDepo;
import java.util.Map;
import java.util.Set;
public class C01_EntrySet {
    public static void main(String[] args) {
        // Ogrenci map'indeki sirali olarak
        // tum ogrencilerin
        // bolum, sinif, sube, isim, soyisim ve numaralarini yazdirin

        // onceki iki derste key(Set) ve value(Collection) degerlerini toplu olarak alabiliyorduk
        // ancak key ve value birlikte kullanmak istedigimizde
        // bu islemi yapmak zor olur

        // Bunun icin Java Entry interface'ini olusturmustur
        // Entry'ler key=value ikilisini bir Entry olarak kabul ederler

        Map<Integer, String> ogrenciMap= MapDepo.ornekMapOlustur();

       System.out.println(ogrenciMap);
       System.out.println(ogrenciMap.size());//6

        ogrenciMap.put(108,"Mehmet-Erkan-12-K-MF");
       /*
        {
        101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz
        }
         */

        Set<Map.Entry<Integer,String>>  ogrenciEntrySeti = ogrenciMap.entrySet();
        System.out.println(ogrenciEntrySeti);

        /*
        [
        101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz
        ]

        Aralarindaki farklar,


        1- Yukaridaki map, bu Set
        2- yukaridakinde {} kullaniyor, bu ise []
        3- yukaridakinde key ve value'ler her eleman icin bir arada ama ayri ayri bireyler
            Entry'de ise K=V ikisi birlikte bir element olusturuyor

         */

        int siraNo=1;

        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySeti
             ) {

            System.out.println(siraNo+"-  "+ eachEntry);
            siraNo++;
        }


        System.out.println("--------Entry'leri kullanarak Key'leri yazdirin--------");
        // Entry'leri kullanarak Key'leri yazdirin

        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySeti
        ) {
            System.out.print(eachEntry.getKey()+" -/- ");
            siraNo++;
        }
        System.out.println("");
        System.out.println("-------Entry'leri kullanarak tum ogrencilerin  siniflarini 1 arttirin...---------");
        // Entry'leri kullanarak tum ogrencilerin  siniflarini 1 arttirin
        // 12. sinifta olan varsa map'ten cikarin

        String entryValue;
        String[] entryValueArr;

        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySeti
        ) {
            // her bir entry deki value alip , parcalayip istenen update 'i yapip,
            // yeniden map'e eklememiz lazim
            entryValue = eachEntry.getValue();
            entryValueArr = entryValue.split("-");

            if (entryValueArr[2].equals("12")) {
                // ogrencinin sinifi 12 ise
                eachEntry.setValue("Mezun oldu");



            } else {
                // ogrencinin sinifi 12 degil ise
                int sinif= Integer.parseInt(entryValueArr[2]);
                sinif++;
                entryValueArr[2]=sinif+"";
                eachEntry.setValue( entryValueArr[0]+"-"+
                                    entryValueArr[1]+"-"+
                                    entryValueArr[2]+"-"+
                                    entryValueArr[3]+"-"+
                                    entryValueArr[4]);
            }

        }


        System.out.println(ogrenciMap);

        /*
        {
        101=Ali-Can-11 -H-MF,
        102=Veli-Cem-12 -M-Soz,
        103=Ali-Cem-12 -H-TM,
        104=Ayse-Can-11 -H-MF,
        105=Ayse-Cem-12 -M-TM,
        106=Fatma-Han-11 -K-Soz
        }
         */














    }
}
