package ders03_datacastingWrapperClass;

public class C05_WrapperClas {

    public static void main(String[] args) {

        int sayi= 10;
        String str="Java cok guzel";
        /*
        primitive data turleri sadece deger barindirirlar hazir method'lari yoktur

        Java'ya yapilan talepler sonucunda java primitive data turleri ile bazi
        hazir method'larin kullanibilmesi icin Wrapper class'lari oluturmustur.

        Wrapper class'lar primitive data turlerindeki degerleri alirlar
        ancak method'lari vardir
         */


        char krk= 'b';

        Character krkWrapper= 'c';

        System.out.println(Character.isLetter('5'));// false
        System.out.println(Character.isDigit('7'));// true
        String str1= "123";
        String str2="12";
        //str1 ve str2'nin degerlerini matematiksel olarak toplayin

        System.out.println(str1+str2);

        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));

        //Integer.parseInt(str) icine yazilan str rakamlardan olusuyorsa str'i int'e cevirir


        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Integer.MIN_VALUE);//-2147483648
        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println(Short.MAX_VALUE);//32768




    }




}
