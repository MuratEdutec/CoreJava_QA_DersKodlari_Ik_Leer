package ders19_Arrrays;

import java.util.Arrays;

public class C05_StringSplitMethodu {
    public static void main(String[] args) {
       /* String str="java gercekten cok cok guzel";
        String [] arrSpace=str.split(" ");
        System.out.println(Arrays.toString(arrSpace));
        String [] arrHiclik=str.split("");
        System.out.println(Arrays.toString(arrHiclik));
        */
        // verilen str'da kaca tane e harfi oldugunu bulunuz



        String str="java gercekten cok cok guzel";
        String []eArrayi= str.split("e");
        System.out.println(Arrays.toString(eArrayi));
        System.out.println(eArrayi.length);// 4 e 5 ayrac
        System.out.println("Metindeli e sayisi : " + (eArrayi.length-1));
        System.out.println("");



        // 2/ yontem..
        // String'i "" ile split yaparak karakterlerine ayiralim

        String[] tumKarakterlerArr=str.split("");
        System.out.println(Arrays.toString(tumKarakterlerArr));
        System.out.println("");
        int sayac=0;

        for (int i = 0; i < tumKarakterlerArr.length; i++) {
            if(tumKarakterlerArr[i].equals("e")){
                sayac++;
            }

        }System.out.println("Metindeki e sayisi : " + sayac);

    }
}
