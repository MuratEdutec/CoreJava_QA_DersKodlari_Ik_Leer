package ders10_stringManipulation;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C05_soru {

    public static void main(String[] args) {

        /*
        email kontrolu yapan bir program yapin
        1- email @ isareti icermiyorsa "gecersiz email"
        2- @gmail.com icermiyorsa "gmail adresi giriniz"
        3- @gmail.com ile bitmiyorsa "yazim hatasi"
            seklinde sonuc yazdirin
                 */

        String email="ahmetbulutluoz@gmail.com";

        if(!email.contains("@")){
            System.out.println("Gecersiz email");

        }else if (!email.contains("@gmail.com")){
            System.out.println("Gmail adresi giriniz");
        }else if (!email.endsWith("@gmail.com")){
            System.out.println("Yazim hatasi");
        }else {
            System.out.println("email basari ile kayit edildi");
        }


    }

}
