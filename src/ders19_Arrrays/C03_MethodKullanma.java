package ders19_Arrrays;

import ders18_Arrays.C03_ArraysElementleriArtirma;
import ders18_Arrays.C04_ArrayElementleriToplama;
import ders18_Arrays.C05_ArrayElemanArama;
import ders18_Arrays.C06_KullaniciyaArrayolusturma;

import java.util.Arrays;

public class C03_MethodKullanma {
    public static void main(String[] args) {
        // verilen bir int array'in elementlerini 2 arttirin

     int [] arr={2,3,4};

     arr= C03_ArraysElementleriArtirma.elementleri2Artir(arr);
        System.out.println(Arrays.toString(arr));

     // arr array'inin elementlerini toplayip sonucu yazdirin

        System.out.println(C04_ArrayElementleriToplama.pozitifElementleriTopla(arr));

     // arr array'inde 10 element olarak var mi?

        C05_ArrayElemanArama.elemanAra(arr,10);

     // kullanicidan deger alarak bir array olusturun

     int [] yeniArr= C06_KullaniciyaArrayolusturma.arrayOlustur();
        System.out.println(Arrays.toString(yeniArr));


    }
}
