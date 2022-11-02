package ders19_Arrrays;

import ders13_nestedForLoop_methodolusturma.C08_MethodOlusturma;
import ders18_Arrays.C06_KullaniciyaArrayolusturma;

import java.util.Arrays;
import java.util.Scanner;

public class C09_KullanicidanDegerAlarakArrayOlusturma {
    public static void main(String[] args) {

        // kullanicidan istedigi kadar sayi alip bir array olusturun
        // kullanici eleman girisini bitirmek icin 0'a bassin

        Scanner scan=new Scanner(System.in);
        int [] arr={0};   // 0 olmasi onemli degil oylesine bir sayi

        int girilenSayi=0;

        do {
            System.out.println("Arraye eklemek icin bir tam sayi giriniz. Bitirmek icin 0'a basin ");
            girilenSayi=scan.nextInt();

            if(arr[0]==0){
                arr[0]=girilenSayi;

            }else if (girilenSayi!=0){
                arr=C08_ArrayaElemanEklemeMethodu.arrayeElemanEkle(arr,girilenSayi);
            }

        }while(girilenSayi!=0);

        System.out.println(Arrays.toString(arr));

    }
}
