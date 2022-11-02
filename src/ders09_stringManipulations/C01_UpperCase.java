package ders09_stringManipulations;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;

public class C01_UpperCase {
    public static void main(String[] args) {


        String str= "Java Mutluluktur";


        System.out.println(str.toUpperCase());//JAVA MUTLULUKTUR
        System.out.println(str);//Java Mutluluktur

        str= str.toUpperCase(); // kalici buyuk harf icin yeniden bir variable'a atanmali
        System.out.println(str);//JAVA MUTLULUKTUR

        str= "ince mehmet";
        str= str.toUpperCase();
        System.out.println(str); //INCE MEHMET

        //str= str.toLowerCase();
        //System.out.println(str);

        System.out.println(str.toLowerCase(Locale.CHINA));
        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));//ınce mehmet  buyuk i yi kucuk ı ya cevirdi





    }
}
