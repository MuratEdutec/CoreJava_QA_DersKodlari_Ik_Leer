package testler_denemeler;

import java.sql.SQLOutput;
import java.util.Scanner;

public class td04 {
    public static void main(String[] args) {

        /* Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi sorun,
        istedigi birim metre veya santimetre ise cevirip yazdirin,
        yoksa “istediginiz birim sisteme kayitli degil” yazdirin. */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mesafayi km olarak giriniz ve hangi birime cevirmek istediginizi yaziniz");

        double mesafe= scan.nextDouble();
        String birim= scan.next();
        double cevrim=1;
        if (birim.equals("santimetre")) {
            cevrim = mesafe* 100000;
            System.out.println("Girmis oldugunuz km '" + mesafe + "' '" + cevrim + "' santimetredir'dir");
        }else if (birim.equals("metre")){
            cevrim=mesafe*1000;
            System.out.println("Girmis oldugunuz km '" + mesafe + "' '" + cevrim + "' metre'dir");

        }else {
            System.out.println("istediginiz birim sisteme kayitli degil");
        }







    }
}
