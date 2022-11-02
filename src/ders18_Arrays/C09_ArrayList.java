package ders18_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_ArrayList {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);


        C06_KullaniciyaArrayolusturma obj1= new C06_KullaniciyaArrayolusturma();


        //List <int> sayilar= new List<>();

        //List <Integer> sayilar= new List<>();

        List <Integer> sayilar= new ArrayList<>();


        // 1- List primitive data kabul etmez
        // 2- List bir inteface oldugu icin direk obje olusturulamaz
        // Onun yerine sag tarafa ArrayList<>() yazariz

        sayilar.add(4);
        sayilar.add(5);
        sayilar.add(2);
        sayilar.add(1);
        sayilar.add(0);

        System.out.println(sayilar);


    }
}
