package ders19_Arrrays;

import java.util.Arrays;

public class C07_ArrayaYeniElementEkleme {
    public static void main(String[] args) {


        int [] arr= {2,4,6};

        // bu array'a 4.bir elemet olarak 8 ekleyelim
        /*
        Var olan bir array'a yeni eleman eklenemez
        ama yeni deger atanabilir

        once int [] arr2=[2,4,6,8] seklinde bir array olusturup
        sonra arr2 degerini arr'ye atayabilirim
         */
        // yeni bir array olusturalim
        // arr2'e konulacak datalarin turu
        // uzunlugu ise eski array'in uzunlugunun 1 fazlasi

        int [] arr2=new int[arr.length+1];//


        for (int i = 0; i <arr.length ; i++) {
            arr2[i]=arr[i];

        }

        System.out.println(Arrays.toString(arr2));//[2, 4, 6, 0]

        arr2[arr2.length-1]=8;

        System.out.println(Arrays.toString(arr2));//[2, 4, 6, 8]


        //arr array'ine yeni deger olarak olusturdugumuz arr2'yi atayacagiz

        arr=arr2;
        System.out.println("arr'in son hali "+Arrays.toString(arr));
    }









}

