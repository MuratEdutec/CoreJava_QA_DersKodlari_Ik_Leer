package ders35_exception;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class C03_ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        // kullanicidan bir index isteyin
        // verilen bir array kullanicinin girdigi index'deki element'i yazdirin


        int[] arr={3,4,6,7,8,2,3,5,6,8,9,1};

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir index giriniz ");

        int index=scan.nextInt();


        try {


            System.out.println(arr[index]);


        } catch (ArrayIndexOutOfBoundsException  hata) {
            System.out.println(hata.getMessage()); //Index 12 out of bounds for length 12

            hata.printStackTrace();
         //  Index 13 out of bounds for length 12
         //   java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 12
         //   at ders35_exception.C03_ArrayIndexOutOfBoundException.main(C03_ArrayIndexOutOfBoundException.java:23)

         // catch blogundaki hicbir kod olmasa da kodlarimiz normal calismaya   BURASI EKSIKKKKKKK------------
            //
            // /


        }


    }

}
