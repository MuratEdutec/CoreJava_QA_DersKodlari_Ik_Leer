package ders05_concatenation_Operatorler;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C04_ifStatements {
    public static void main(String[] args) {

   //kullanicidan iki sayi alin
        // eger birinci sayi 100'den buyukse, ilk sayi 100'den buyuk yazdirin
        // eger ikinci sayi ciftse "ikinci sayi cift sayi yazdirin"
        // eger ilk sayi ikinci sayidan buyukse  "ilk sayi daha buyuk" yazdirin


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz");
        int s1= scan.nextInt();
        int s2= scan.nextInt();


        // eger birinci sayi 100'den buyukse, ilk sayi 100'den buyuk yazdirin

        if(s1>100){
            System.out.println("Ilk sayi 100'den buyuk");
        }

        // eger ikinci sayi ciftse "ikinci sayi cift sayi" yazdirin"
        if(s2%2==0) {
            System.out.println("Sayiniz cift sayidir");
        }

        if(s1>s2){
            System.out.println("ilk sayiniz buyuktur");
        }



        // eger ilk sayi ikinci sayidan buyukse  "ilk sayi daha buyuk" yazdirin











    }
}
