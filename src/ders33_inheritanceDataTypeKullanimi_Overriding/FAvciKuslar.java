package ders33_inheritanceDataTypeKullanimi_Overriding;

import org.w3c.dom.ls.LSOutput;

public class FAvciKuslar extends EKuslar{
    public void hareket (){
        System.out.println("Avci kuslar ucarlar");
    }
    public void beslenme (){
        System.out.println("Avci kuslar et yerler");
    }
    public void pence(){
        System.out.println("Avci kuslar pencelidir");
    }
    public void gaga(){
        System.out.println("Avci kuslar sivri gagalidir");
    }


    public static void main(String[] args) {
        FAvciKuslar avci1 = new FAvciKuslar();
    /*
     Bir obhe olusturulurken
     constructor ve data turu ayni ise
     Hangi METHOD'un gecerli oldugunun bulmak icin
     o class'a gider varsa kullaniriz
     yoksa sirasi ile parent'lara gider ilk buldugumuzu kullanir
     */


        System.out.println("---------- Avci Kuslar ---");
        avci1.beslenme();// Avci kuslar
        avci1.gaga();// Avci kuslar
        avci1.pence();// Avci kuslar
        avci1.hareket();// Avci kuslar
        avci1.cogalma();// Kuslar
        avci1.kanat();// Kuslar
        avci1.omur();// Hayvanlar
        avci1.solunum();// Kuslar



        EKuslar avci2=new FAvciKuslar();

        /*
        Bir obje olusturulurken data turu ile constructor farkli ise
        hangi METHOD'un gecerli olacagini bulmak icin

        Once data turunun oldugu class ve parent'larina bakarak
        o method'u buluruz.
        Bulumazsak CTE verir.

        bulursak HEMEN CALISTIRMAYIZ
        calistirmadan once o method override edilmismi diye kontrol ederiz
        override edilmisse en override eden method'u calistiririz
         */
        System.out.println("---------- Avci Kuslar ---");
        avci2.beslenme();// Avci kuslar
        avci2.gaga();// Avci kuslar
        //avci2.pence();// Avci kuslar
        avci2.hareket();// Avci kuslar
        avci2.cogalma();// Kuslar
        avci2.kanat();// Kuslar
        avci2.omur();// Hayvanlar
        avci2.solunum();// Kuslar















    }

}

























