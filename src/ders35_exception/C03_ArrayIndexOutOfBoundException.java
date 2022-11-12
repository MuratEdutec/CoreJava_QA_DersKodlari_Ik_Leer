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
        System.out.println(arr[index]);



    }

}
