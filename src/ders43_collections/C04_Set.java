package ders43_collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C04_Set {
    public static void main(String[] args) {


        Set<Integer> sayilar= new HashSet<>();

        sayilar.add(19);
        sayilar.add(15);

        Set<Integer>siraliSet= new TreeSet<>();
        siraliSet.add(43);
        siraliSet.add(34);
        siraliSet.addAll(sayilar);

        System.out.println(siraliSet); //[15, 19, 34, 43]


        // bir hashset ve treeset olusturalim
        // ikisini de random 1000 tane sayi ekleyip
        // islem surelerini kiyaslayalim
        Random rnd=new Random();
        int sayi;

        LocalTime hashBas=LocalTime.now();
        for (int i = 0; i <500000 ; i++) {
        sayi= rnd.nextInt(500000);
        sayilar.add(sayi);
        }
        LocalTime hashBit=LocalTime.now();


        LocalTime treebas=LocalTime.now();
        for (int i = 0; i <500000 ; i++) {
            sayi= rnd.nextInt(500000);
            siraliSet.add(sayi);
        }
        LocalTime treeBit=LocalTime.now();


        System.out.println("hashSet bas-> "+hashBas+" -bitis-> "+hashBit);
        System.out.println("hashSet bas-> "+treebas+" -bitis-> "+treeBit);
        System.out.println("has  suresi-> "+(hashBit.getNano()-hashBas.getNano()));
        System.out.println("tree suresi-> "+(treeBit.getNano()-treebas.getNano()));
















    }
}
