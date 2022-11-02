package ders22_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArraysAsList {
    public static void main(String[] args) {

        Integer [] arr= {1,2,3};

        // verilen bir array'i liste cevirmek icin
        // bir list olusuturup for loop ile elemanlari tasimayi tavsiye ediyoruz

        List <Integer> arraydenList= Arrays.asList(arr);
        System.out.println(arraydenList);//[1, 2, 3]

        // Bu yontemin 2 negatif yani vardir
        // 1- bu sekilde olusturulan list'ler esnek uzunluga sahip degillerdir
        // add remove gibi ozellikleri kullanmak isterseniz RunTimeException olusur

        //arraydenList.add(10);
        //arraydenList.remove(1);


        // 2- bu yontem kaynak olan yontem ile yeni olusuturulan list'i birbirine baglar
        // birbirine yaptiginiz degisikligi, otomatik olarak digerine de yansitir.
        System.out.println("Array :" + Arrays.toString(arr));
        System.out.println("Liste : "+ arraydenList);
        arr[0]=10;
        System.out.println("array'i degistirince Array :" + Arrays.toString(arr));
        System.out.println("array'i degisitrince Liste : "+ arraydenList);










    }
}
