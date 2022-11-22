package ders42_connections;

import java.util.LinkedList;
import java.util.List;

public class c01_LinkedList {
    public static void main(String[] args) {


        LinkedList<String> ll1= new LinkedList<>();

        ll1.add("K");
        ll1.add("T");


        //


        List<String> ll2=new LinkedList<>();

        // Daha onceden array list olustururken, List <> interface'ini data turu olarak kullandigimizdan
        // bu sekilde olusturulan LinkedList'lerin ozelliklerini biliyoruz


        ll2.add("R");//[R]
        System.out.println(ll2);

        ll2.add("Z");//[R, Z] --- sona ekler
        System.out.println(ll2);

        ll2.add(0,"A");
        System.out.println(ll2);

        ll2.addAll(2,ll1);//[A, R, I, Z, A]
        System.out.println(ll2);

        ll2.set(3,"M");
        System.out.println(ll2);//[A, R, I, M, A]
        ll2.add("K");
        ll2.add("T");

        System.out.println(ll2.get(1));//R

        System.out.println(ll2.retainAll(ll1));
        System.out.println(ll2);
        ll2.add("A");
        System.out.println(ll2.hashCode());//3232590

        System.out.println(ll2.subList(2, 4));//[K,K,T,A] 2 dahil, 4 dahil olmadigindan exception firlatmaz



    }
}
