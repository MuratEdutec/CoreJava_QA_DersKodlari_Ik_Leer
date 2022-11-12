package ders35_exception;

import java.util.Scanner;

public class C01_Exception {
    public static void main(String[] args) {


    // kullanicidan bir tamsayi alin
    // ve sayinin karesini yazdirin
    // kullanici ondalikli sayi girerse kullanaciya uyari yazisi yazdorop
    // tekrar sayi isteyin

    Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int girilenSayi=scan.nextInt();
        System.out.println(girilenSayi*girilenSayi);


    }


}
