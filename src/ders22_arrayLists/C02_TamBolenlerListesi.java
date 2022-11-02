package ders22_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_TamBolenlerListesi {
    public static void main(String[] args) {
        //Kullanicidan pozitif bir tamsayi alip,
        // o tamsayiyi tam bolebilen tum pozitif
        // tamsayilari bir liste olarak bize donduren bir method olusturun.
        int input= 128;

        System.out.println(input +" Sayisinin Tam Bolenler Listesi --> "+tamBolenlerListesi(input));

    }
    public static List<Integer> tamBolenlerListesi(int input){

        List<Integer>tambolenlerListesi=new ArrayList<>();
        for (int i = 1; i <=input ; i++) {
            if(input%i==0){
                tambolenlerListesi.add(i);
            }

        }
        return tambolenlerListesi;

    }
}
