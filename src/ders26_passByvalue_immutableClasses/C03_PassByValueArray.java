package ders26_passByvalue_immutableClasses;

import java.util.Arrays;

public class C03_PassByValueArray {

    public static void main(String[] args) {
        // verilen bir array'in elementlerini 5 arttirip
        // sonra yazdiran bir method olusturun

        int [] arr={3,4,5};
        arrayElementleri5Artir(arr);
        arrayElementleri5Artir(arr);
        arrayElementleri5Artir(arr);

        System.out.println("Method call'dan sonra main method icinde arr : "+Arrays.toString(arr));


    }
    public static void arrayElementleri5Artir(int [] arr){

        for (int i = 0; i < arr.length; i++) {
            arr[i]= arr[i]+5;
        }
        System.out.println(Arrays.toString(arr));
    }

}
