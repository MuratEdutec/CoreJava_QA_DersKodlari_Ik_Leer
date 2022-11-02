package ders14_meethodOlusturma;

import java.util.Scanner;

public class C02_StringConcate {

    // verilen iki stringi paramatre olarak kabul edip
    // bu iki string'i aralarinda bir bosluk olan tek bir String
    // olarak main method'a donduren bir method olusturun

    public static void main(String[] args) {

        /* Scanner scan=new Scanner(System.in);
        String str1=scan.nextLine();
        String str2=scan.nextLine();
*/
        String str1="Java";
        String str2="Candir";

        System.out.println(birlestirMethodu(str1,str2));
        System.out.println(birlestirMethodu("Bu da","oldu"));

    }

    public static String birlestirMethodu(String str1,String str2){
        return str1+" "+ str2;

    }




}
