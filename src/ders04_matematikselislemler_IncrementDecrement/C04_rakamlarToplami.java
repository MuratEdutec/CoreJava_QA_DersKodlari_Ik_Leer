package ders04_matematikselislemler_IncrementDecrement;

import java.util.Scanner;

public class C04_rakamlarToplami {
    public static void main(String[] args) {
//kullanicinin girdigi 4 basamakli bir sayinin rakamlar toplamainin veren bir kod yaziniz


      //  int input=1453;
        System.out.println("lutfen 4 basamakli sayi giriniz");
        Scanner scan=new Scanner(System.in);
      int input =scan.nextInt();

        int birlerBasamagi;
        int rakamlarToplami=0;

        //1-birler basamagini al
        birlerBasamagi= input%10;//3
        //2-birler basamagini rakamlar toplamina ekle
        rakamlarToplami=rakamlarToplami+birlerBasamagi;//3
        //3-birler basamagindan kurtul
        input=input/10;//145


        birlerBasamagi= input%10;//
        rakamlarToplami=rakamlarToplami+birlerBasamagi;//3
        input=input/10;//14

        birlerBasamagi= input%10;//
        rakamlarToplami=rakamlarToplami+birlerBasamagi;//3
        input=input/10;//1

        birlerBasamagi= input%10;//
        rakamlarToplami=rakamlarToplami+birlerBasamagi;//3
        input=input/10;//0

        System.out.println("Verdiginiz rakamlar toplami  "+ rakamlarToplami);




    }


}
