package ders06_ifelseStatements;

import java.util.Scanner;

public class C09_IfElseIfStatements {
    public static void main(String[] args) {
//kullanicidan bir tams sayi ali
        //sayi negatif ise "gecersiz sayi"
        //tek basamakli ise "rakam"
        //iki basamakli ise "iki basamaklisayi"
        //bunun disindaki sayilar icin "nbuyuk sayi" yazdirin

        //Scanner scan=new Scanner(System.in);
        //int sayi=scan.nextInt();
        int sayi=20;

        if (sayi<0){
            System.out.println("Gecersiz sayi");
        } else if (sayi <10) {
            System.out.println("Rakam");
        } else if (sayi<100) {
            System.out.println("Iki basamakli sayi");
        }else {
            System.out.println("Buyuk sayi");
        }


    }


}
