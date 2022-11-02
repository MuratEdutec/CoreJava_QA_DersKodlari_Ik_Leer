package testler_denemeler;

import java.util.Scanner;

public class td07_whileLoop {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int sayi=0;
        int toplam=0;

        while(toplam <= 100){
            System.out.println("Lutfen toplamak istedginiz sayi girin");
            sayi=scan.nextInt();
            toplam+=sayi;
        }
        System.out.println("girilen sayilar toplami : "+ toplam);
    }
}
