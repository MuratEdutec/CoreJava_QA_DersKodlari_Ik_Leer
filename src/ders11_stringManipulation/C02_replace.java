package ders11_stringManipulation;

import java.sql.SQLOutput;

public class C02_replace {
    public static void main(String[] args) {

        String str= "Java candir";

        System.out.println(str.replace('a', 'A')); // JAvA cAndir

        System.out.println(str.replace(' ', '_'));

        System.out.println(str.replace("candir", "cok guzeldir"));

        System.out.println(str.replace(" ", ""));
        System.out.println(str.replace("a", ""));

        //Java yerine hava, candir yerine cok guzel yazdirin

        System.out.println(str.replace("Java", "Hava").replace("candir", "cok guzel"));

        //sadece ilk a'yi A yapin

        System.out.println(str.replaceFirst("a","A"));
        System.out.println(str.replace("", "_"));// hiclik oldugu icin her harfin onunde her her karaterin onun _ koyar



    }
}
