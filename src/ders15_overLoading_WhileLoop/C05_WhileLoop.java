package ders15_overLoading_WhileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {

        /* kullanicidan toplanmak uzere sayi alin,
        sayilarin toplami 500'e esit olur veya gecerse

        girilen sayi adedi.
        girilen sayilarin toplamini yazdirin
         */

        Scanner scan= new Scanner(System.in);

        double girilenSayi=0;
        double toplam=0;
        int sayac=0;


        while (toplam<500){

            System.out.println("Lutfen toplamak istedginiz sayi girin");
            girilenSayi=scan.nextDouble();

            toplam+=girilenSayi;
            sayac++;

        }


        System.out.println("Girilen "+ sayac + " sayinin toplami : "+toplam+ " oldu. Bu kadar yeter") ;



    }
}
