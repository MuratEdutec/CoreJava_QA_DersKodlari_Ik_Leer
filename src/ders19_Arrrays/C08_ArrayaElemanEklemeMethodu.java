package ders19_Arrrays;

import java.util.Arrays;

public class C08_ArrayaElemanEklemeMethodu {

    public static void main(String[] args) {

        // verilen bir int array'e istenen bir elementi ekleyip
        // yeni halini bize donduren bir method olusturun

        int [] abc={3,5,8,9};

        int eklenecekSayi=1;

        abc= arrayeElemanEkle(abc,eklenecekSayi);
        System.out.println(Arrays.toString(abc));
    }

    public static int [] arrayeElemanEkle(int [] eklenecekArr, int eklenecekSayi){

        int [] yeniArray= new int[eklenecekArr.length+1];

        for (int i = 0; i <eklenecekArr.length ; i++) {
            yeniArray[i]=eklenecekArr[i];
        }

        yeniArray[yeniArray.length-1]=eklenecekSayi;

        return yeniArray;

    }



}
