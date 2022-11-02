package ders09_stringManipulations;

public class C04_chartAt {
    public static void main(String[] args) {

        String str= "Java Candir";

        System.out.println(str.charAt(0));//J
        System.out.println(str.charAt(5));//C
        System.out.println(str.charAt(4));// bosluk karakteriiii
        System.out.println(str.charAt(10));// sonuncu karakteri yazdirin  r

        /*
        bir metindeki karakter sayisi ile son index arasinda 1 fark vardir.
        bu metin (Java Candir)  karakter sayisi 11
                                son index       10 dur.
         */

      // System.out.println(str.charAt(11));//StringIndexOutOfBoundsException: Index 11



    }
}
