package ders15_overLoading_WhileLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {
        /* Kullanicadan toplanmak uzere tam sayilar alin
        kullanici 0'a basarsa sayi alma islemini bitirin

        kullanicinin kac sayi girdigini
        ve bu sayilarin toplaminin kac oldugunu yazdirin
         */

        Scanner scan= new Scanner(System.in);
        int girilenSayi=5;  // verilen ilk deger bu soru icin 0 olmamali
                            // cunku 0 loopú bitirmek icin kullanacak
        //for (int i = 1; i < ; i++)  bu dongude girilecek miktra sikintisi oldugundan whileloop tercih edilir
        int sayac=0;
        int toplam=0;


        while( girilenSayi !=0){
            System.out.println("Lutfen toplamak icin tamsayi girin eger bitirmek isterseniz 0'a basin");

            girilenSayi= scan.nextInt();

            if (girilenSayi !=0) {
                sayac++;
                toplam = toplam + girilenSayi;


            }
        }

        System.out.println("Girilen "+ sayac +" sayinin toplami "+ toplam);








    }

}
