package ders29_stringBuilders_AccessModifier;

public class C02_StringBuilder {
    public static void main(String[] args) {


        StringBuilder sb1= new StringBuilder("Java Candir");


        sb1= sb1.reverse();//ridnaC avaJ
        System.out.println("Tersini yazdirdiktan sonra sb1 :" +sb1);
        sb1.insert(0, ".");
        System.out.println(sb1);//.ridnaC avaJ

        sb1.reverse();

        StringBuilder sb2=new StringBuilder("Java Candir.");
        String str="Java Candir.";

        System.out.println(sb1 == sb2);// false icerik ayni olsa bile false verir
        System.out.println(sb1.equals(sb2));// false
        System.out.println(sb1==sb1);// true   sadece bir sb kendisi ile karsilastirilirsa true verir
        //System.out.println(sb1==str);// kabul etmezzzz farkli 2 data turu ile karsilastirilamaz

        System.out.println(sb1.equals(sb2));// false icerik ayni olsa bile false verir
        System.out.println(sb1.equals(sb1));//  true  sadece bir sb kendisi ile karsilastirilirsa true verir
        System.out.println(sb1.equals(str));// false  CTE vermez fakat sonuc her zaman false olur

        System.out.println(sb1.compareTo(sb2));// int doner 0

        StringBuilder sb3=new StringBuilder("Hava Kandir");
        System.out.println(sb1.compareTo(sb3));//2
        StringBuilder sb4=new StringBuilder("Jaka Kandir");
        System.out.println(sb1.compareTo(sb4));//11

        /*
        CompareTo sadece tamamen ayni mi yoksa farkli mi sorusunun cevabini verir
        tamamen ayni ise  ==> 0 doner
        Farklilik var ise o zaman ilk farkli harfi buldugunda farkli harflerin arasinda kac harf oldugunu verir


         */

    }


}
