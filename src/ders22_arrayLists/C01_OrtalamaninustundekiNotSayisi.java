package ders22_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_OrtalamaninustundekiNotSayisi {
    public static void main(String[] args) {
        // Ogremetmenden ogrenci notlarini alip bir liste olusturun
        // ogretmen q'ya basip bitirdiginde

        // sinif sayisini, sinif ortalamasini ve kac kisinin ortalamamnin ustunde not aldigini yazidir
    
        List <Double> notlar=listeOlustur();
        raporla (notlar);

       //System.out.println(notlar);
    }

    private static void raporla(List<Double> notlar) {
        
        int ogrenciSayisi= notlar.size();
        
        double notlarToplami=0.0;
        double sinifNotOrtlamasi=0.0;
        
        int ortalamaUstundekiOgrenciSayisi=0;
        
        // notlar toplamini bulamalim
        
        for (int i = 0; i <notlar.size(); i++) {
            
            notlarToplami += notlar.get(i);
            
        } 
        
        // not ortalamasini bulalim
        
        sinifNotOrtlamasi=notlarToplami/ogrenciSayisi;
        
        // ortalama ustundeki ogrenci sayini bulalim

        for (int i = 0; i < notlar.size(); i++) {
            if(notlar.get(i)>sinifNotOrtlamasi)
                ortalamaUstundekiOgrenciSayisi++;
        }
        
        // rapor icin istenenleri yazdiralim


        System.out.print("\nGirilen Not Sayisi :" + ogrenciSayisi+
        "\nGirilen Notlarin Ortalamasi :" + sinifNotOrtlamasi+
        "\nOrtalama Uzerindeki Ogrenci Sayisi : "+ ortalamaUstundekiOgrenciSayisi);
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public static List <Double> listeOlustur(){

        List<Double> notlar= new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        Double girilenNot=5.0; // yada double cast edilir =(double)5

        while(girilenNot<=100){

            System.out.println("Lutfen eklemek icin Not giriniz, cikis icin 100'den buyuk bir sayi giriniz : ");

            girilenNot=scan.nextDouble();
            if(girilenNot<=100){
                notlar.add(girilenNot);
            }
        }
        return notlar;
}
}

