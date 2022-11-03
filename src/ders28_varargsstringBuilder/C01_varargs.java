package ders28_varargsstringBuilder;

public class C01_varargs {
    public static void main(String[] args) {
        topla(5,6);
        topla(5,3,8);
        topla(5,3,8,9);

    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println(" 4 sayinin toplami : " + (sayi1+sayi2));

    }

    private static void topla(int sayi1, int sayi2, int sai3) {

        System.out.println(" 3 sayinin toplami : " + (sayi1+sayi2));
    }

    public static void topla(int sayi1, int sayi2) {

        System.out.println(" 2 sayinin toplami : " + (sayi1+sayi2));
    }
}
