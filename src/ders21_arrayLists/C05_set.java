package ders21_arrayLists;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_set {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 3, 5, 3, 5, 2, 5, 1, 2, 4, 5, 3, 4, 5};

        // List.set (index,yeniDeger) method'u
        // istenen index'deki eski degeri silip bize dondurur
        // ve o indexteki degeri verdigimiz yeni deger olarak atar





        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

             sayilar.add(arr[i]);
            }

        // Java'da set () methodlari update icin kullanilir
        // add () ile set () farklidir

        System.out.println(sayilar.set(0, 8));
        System.out.println(sayilar.set(1, 9));
        sayilar.set(0,8);
        sayilar.set(1,9);
        System.out.println(sayilar);

























        }
}
