package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_topluElemanEkleme {
    public static void main(String[] args) {

        List<String> harfler= new ArrayList<>();

        // tum sesli harfleri listeye ekleyin
        // ekelenecek tum arrayleri bir element olarak yazip
        // sonra for loop ile list'e ekleyebiliriz

        String [] arr={"a","e","i","o","u"};

        for (int i = 0; i < arr.length; i++) {

            harfler.add(arr[i]);



        }
        System.out.println(harfler);



    }
}
