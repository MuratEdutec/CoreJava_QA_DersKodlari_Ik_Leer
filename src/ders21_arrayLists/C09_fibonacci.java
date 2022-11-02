package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_fibonacci {
    public static void main(String[] args) {
       // Kullanicidan pozitif bir tamsayi alip,
       // o tamsayidan kucuk Fibonacci sayilarini/
       // bir liste olarak bize donduren bir liste olarak yazdirin.
        // 0 1 1 2 3 5 8 13 21 34 55 89 144 ....

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz : ");
        int girilenSayi= scan.nextInt();
        if (girilenSayi<0){
            System.out.println("Fibonacci serisi 0'dan buyuk tam girmelisin ");
        }else if(girilenSayi==0 ) {
            System.out.println("0'dan kucuk Fibonacci sayisi yoktur");

        }else if (girilenSayi== 1){
            System.out.println("1'den kucuk tek Fibonacci sayisi vardir : 0");
        }else {
            fibonacciSayilariniYazdir(girilenSayi);
        }

    }

    public static void fibonacciSayilariniYazdir(int girilenSayi) {
        // buraya geldi ise girilen sayi 1'den buyuktur

        List<Integer>fibonacciListesi=new ArrayList<>();
        fibonacciListesi.add(0);// index 0
        fibonacciListesi.add(1);// index 1
        fibonacciListesi.add(1);// index 2

        int yeniFibonacciSayisi=0;
        int index=3;// index 3


        while(yeniFibonacciSayisi< girilenSayi){

            yeniFibonacciSayisi=fibonacciListesi.get(index-2) +fibonacciListesi.get(index-1);

            if(yeniFibonacciSayisi< girilenSayi){
                fibonacciListesi.add(yeniFibonacciSayisi);
            }

            index++;


        }
        System.out.println(fibonacciListesi);






    }


}
