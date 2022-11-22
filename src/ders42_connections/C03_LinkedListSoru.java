package ders42_connections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C03_LinkedListSoru {

    static List<Double> notListesi= new LinkedList<>();


    public static void main(String[] args) {



    /*
Soru : Bir ogretmenden ogrencilerin notlarini girmesini isteyin, not grime islemi bittiginde Q’ya basmalidir. Not grime islemi bittikten sonra asagidaki sekilde output hazirlayin
 not ortalamasi : …..
 ogrenci sayisi : …..
 ortalama altindaki ogrenci sayisi : ….
 ortalamanin 10 puan alt ve ustunde olan ogrenci sayisi : ….
 */


        System.out.println("Oncelikle ogrenci not listesini olusturalim");
        notListesineDegerEkle();
        System.out.println(notListesi);


    }
    public static void notListesineDegerEkle(){

        Scanner scan= new Scanner(System.in);
        double not;
        boolean loopDevam=true;

        while (loopDevam){


            try {
                System.out.println("Lutfen ogrenci notlarini giriniz \n bitirmek icin Q'ya basiniz");
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
