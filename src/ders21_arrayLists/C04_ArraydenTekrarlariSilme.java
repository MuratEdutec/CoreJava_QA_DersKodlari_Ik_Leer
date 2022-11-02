package ders21_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraydenTekrarlariSilme {
    public static void main(String[] args) {

        // verilen bir array'deki tekrar eden sayilari
        // bir kere olacak sekilde arrayí tekrardan duzenleyin

        int[] arr = {1, 2, 4, 3, 5, 3, 5, 2, 5, 1, 2, 4, 5, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        //  BU SORUYU ARRAY ILE YAPMAK COK ZOR
        // BUNUN YERINE BU ARRAY'IN ELEMANLARINI TEK TEK INCELEYIP
        // TEKRARSIZ OLANLARI BIR LIST'E ATALIM


        List<Integer> tekrarsizListe = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!tekrarsizListe.contains(arr[i])) {

                tekrarsizListe.add(arr[i]);
            }
            }

            System.out.println("Tekrarsiz liste " + tekrarsizListe);
        // EN SON O LIST'DEKI ELEMENTLERI ARRAY'E ATAMAK GEREKIR
        // BUNUN ICN ONCE ARRAY'EYENI VE BOS BIR ARRAY DEGERI ATAYIM
        // SONRA LIST'DEKI ELEMENTLERI ARRAY'E TASIYALIM


        arr= new int[tekrarsizListe.size()];
        for (int i = 0; i < arr.length; i++) {

            arr[i]= tekrarsizListe.get(i);

        }

        System.out.println(arr);


    }
}