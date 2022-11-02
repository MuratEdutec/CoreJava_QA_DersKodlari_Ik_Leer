package ders26_passByvalue_immutableClasses;

import java.util.Arrays;

public class C05_PassByValueArray2 {
    public static void main(String[] args) {


        // bir method olusturun
        // sayilar array'inin uzunlugundan 2 fazla olan
        // ve elementlerin tamami 5 olan yeni bir array olusturup
        //  deger olarak sayilar arrayína atayin ve sayilar arrrayínin yazdirin


        int [] sayilar= {3,4,5};
        arrayeYeniDegerAta(sayilar);
        System.out.println(Arrays.toString(sayilar));
    }
    public static void arrayeYeniDegerAta(int []sayilar){

        int [] yeniArr= new int[sayilar.length+2];

        for (int i = 0; i < yeniArr.length; i++) {
            yeniArr[i]=5;
        }
        sayilar= yeniArr;
        System.out.println("Method 'da sayilarin son hali : "+ Arrays.toString(sayilar));
    }
}
