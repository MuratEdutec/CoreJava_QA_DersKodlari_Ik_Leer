package ders12_forLoops;

import com.sun.nio.sctp.AbstractNotificationHandler;

import java.sql.Struct;

public class C04_rakamlarToplami {

    public static void main(String[] args) {

        //kullanicinin verdigi sayinin rakamlar toplamini bulun

      /*  int sayi=1453;

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        for (int i= 1; i <=4; i++){
            birlerBasamagi=sayi%10;
            rakamlarToplami=rakamlarToplami+birlerBasamagi;
            sayi=sayi/10;
        }
        System.out.println(rakamlarToplami);

        //---------------
        */
        int sayi=232;
        String sayiStr=""+sayi;
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        for (int i= 1; i <=sayiStr.length(); i++){
            birlerBasamagi=sayi%10;
            rakamlarToplami=rakamlarToplami+birlerBasamagi;
            sayi=sayi/10;
        }
        System.out.println(rakamlarToplami);










    }

}
