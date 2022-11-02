package ders04_matematikselislemler_IncrementDecrement;

import java.util.Scanner;

public class C05_IncrementDecrement {

    public static void main(String[] args) {

        int sayi=10;
        // bu sayiyi 3 arttiralim ve yazdiralim


        sayi= sayi+3;
        System.out.println(sayi);//13

        sayi+=3;
        System.out.println(sayi);//16



        int s=10;
        //bu sayiyi 1 arttirin

        s=s+1;
        System.out.println(s);//11

        s+=1;
        System.out.println(s);//12

        s++;//POST INCREMENT
        System.out.println(s);//13

        ++s;//PRE INCREMENT
        System.out.println(s);


        int t=10;
        t=t-1;//9
        t-=1;//8
        t--;//7-  POST DECREMENT
        --t;//6   PRE DECREMENT
        System.out.println(t);






            }



}
