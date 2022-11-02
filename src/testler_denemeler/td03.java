package testler_denemeler;

import java.sql.SQLOutput;
import java.util.Scanner;

public class td03 {
    public static void main(String[] args) {
        //Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
        // “Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
        //gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme zamani” yzdirin.

      Scanner scan=new Scanner(System.in);
      String gun= scan.next().toLowerCase();

        //String gun="pazar";

        int tatileKalanGun= 6;

        if(gun.equals("pazartesi"))
        {    tatileKalanGun= tatileKalanGun -1;
           System.out.println("Simdi calisma zamani tatile '"+ tatileKalanGun +"' gun daha var");
        } else if (gun.equals("sali"))
        {    tatileKalanGun= tatileKalanGun -2;
            System.out.println("Simdi calisma zamani tatile '"+ tatileKalanGun +"' gun daha var");
        }else if (gun.equals("carsamba"))
        {    tatileKalanGun= tatileKalanGun -3;
            System.out.println("Simdi calisma zamani tatile '"+ tatileKalanGun +"' gun daha var");
        }else if (gun.equals("persembe"))
        {    tatileKalanGun= tatileKalanGun -4;
            System.out.println("Simdi calisma zamani tatile '"+ tatileKalanGun +"' gun daha var");
        }else if (gun.equals("Cuma"))
        {    tatileKalanGun= tatileKalanGun -5;
            System.out.println("Simdi calisma zamani tatile '"+ tatileKalanGun +"' gun daha var");
        }else if (gun.equals("cumartesi") || gun.equals("pazar")) {
            System.out.println("Simdi dinlenme zamani");
        }
        else {
            System.out.println("Gecersiz giris");
        }





       //--
    }
}

