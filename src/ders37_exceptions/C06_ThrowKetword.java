package ders37_exceptions;

import java.util.Scanner;

public class C06_ThrowKetword {
    public static void main(String[] args) {


    // Kullanicidan yasini isteyin
    // eger 0 veya negatif bir sayi girerse
    // uyari olarak IllegalArgumentException uyarisi verin
    // ancak kodumuz normal calismaya devam etsin

    Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz ");
        int yas= scan.nextInt();

        if (yas<=0){
            //System.out.println("Yas sifir veya negatif olamaz");
            //System.out.println("Yas sifir veya negatif olamaz");

            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                System.out.println("Yas sifir veya negatif olamaz");
            }

        }
}
}