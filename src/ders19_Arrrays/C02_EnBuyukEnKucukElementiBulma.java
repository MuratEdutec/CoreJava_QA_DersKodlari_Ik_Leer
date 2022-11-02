package ders19_Arrrays;

import java.util.Arrays;

public class C02_EnBuyukEnKucukElementiBulma {
    public static void main(String[] args) {
        // Verilen bir int array'da en kucuk ve en buyuk sayilari yazdiran bir method olusturun

        int [] arr= { 3,8,1,5,2,4,6,7,8,9,};
        enBuyukEnKucukElementYazdir(arr);


    }
    public static void enBuyukEnKucukElementYazdir(int [] arr){

        Arrays.sort(arr);
        System.out.println("En buyuk element: " +arr[arr.length-1]);
        System.out.println("En kuyuk element: " +arr[0]);
    }


}
