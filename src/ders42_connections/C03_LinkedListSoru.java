package ders42_connections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C03_LinkedListSoru {

    /*
Soru : Bir ogretmenden ogrencilerin notlarini girmesini isteyin, not grime islemi bittiginde Q’ya basmalidir. Not grime islemi bittikten sonra asagidaki sekilde output hazirlayin
 not ortalamasi : …..
 ogrenci sayisi : …..
 ortalama altindaki ogrenci sayisi : ….
 ortalamanin 10 puan alt ve ustunde olan ogrenci sayisi : ….
 */
    static List<Double> notListesi= new LinkedList<>();

    public static void main(String[] args) {


        System.out.println("=_=_=_= >> Oncelikle ogrenci not listesini olusturalim << =_=_=_=");
        notListesineDegerEkle();

        double notToplami=0;
        double notOrtalamasi ;
        int ortalamaAltindakiOgrenciSayisi = 0;
        int ortalamanin10puanAltUstOgrenciSayisi=0;

        for (Double eachNot:notListesi
             ) {
            notToplami+=eachNot;
        }
        notOrtalamasi= notToplami/notListesi.size();
        for (Double eachNot: notListesi
             ) {
            if (eachNot < notOrtalamasi) {
                ortalamaAltindakiOgrenciSayisi += 1;
            }
            if (eachNot >= notOrtalamasi - 10 && eachNot <= +10) {
                ortalamanin10puanAltUstOgrenciSayisi+=1;

            }
        }


        System.out.println(
                "Not ortalamasi                                             : " + notOrtalamasi+
                "\nOgrenci sayisi                                           : " + notListesi.size()+
                "\nOrtalama altindaki ogrenci sayisi                        : " + ortalamaAltindakiOgrenciSayisi+
                "\nOrtalamanin 10 puan alt ve ustunde olan ogrenci sayisi   : " + ortalamanin10puanAltUstOgrenciSayisi);


    }
    public static void notListesineDegerEkle(){

        Scanner scan= new Scanner(System.in);
        double not;
        boolean loopDevam=true;

        while (loopDevam){


            try {
                System.out.print("Lutfen ogrenci notlarini giriniz, -->> Bitirmek icin Q'ya basiniz  --->> ");
                not=scan.nextDouble();
                notListesi.add(not);
            } catch (Exception e) {

                String girilenDeger=scan.nextLine();

                if(girilenDeger.equalsIgnoreCase("Q")){
                        //loopDevam=false;
                        break;
            }else {
                    System.out.println("Not icin sayisal degerler girmelisiniz");
                }
            }


        }







    }
}

