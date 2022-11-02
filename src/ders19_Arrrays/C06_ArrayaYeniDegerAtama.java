package ders19_Arrrays;

import java.util.Arrays;

public class C06_ArrayaYeniDegerAtama {

    public static void main(String[] args) {

        String str="java";
        str="hava";

        /*
        Var olan bir array'in uzunlugu degistirilemez
        AMA
        var olan bir array'a yeni bir array degeri atanabilir
        */

        // 1- var olan bir array'i yeni deger olarak atayabilirz

        String [] arr1={"Ali","Veli"};
        String [] arr2={"A","B","C",};

        arr1=arr2;

        System.out.println(Arrays.toString(arr1)); //[A, B, C]

        // 2- istedigimiz uzunluktaki yeni bos bir array degeri atayabiliriz

        arr1= new String[6];
        System.out.println(Arrays.toString(arr1));


        // 3- yeni olusturulan bir array'a { } icinde deger yazarak atama yapabiliriz
        // ancak var olan bir array'e yeni deger atamasi icin { } KULLANILAMAZ

        // arr1={"a","h"};    <--OLMAZ





    }



}
