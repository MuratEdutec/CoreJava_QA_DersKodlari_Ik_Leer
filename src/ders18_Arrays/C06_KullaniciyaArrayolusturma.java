package ders18_Arrays;
/////////////////////EKSIKKKKKKKKKKKKKKKKKKKKKKKKKKK
import java.util.Arrays;
import java.util.Scanner;

public class C06_KullaniciyaArrayolusturma {
    public static void main(String[] args) {

       // Kullanicidan array’in boyutunu ve elementlerini alip
        // array’i olusturan ve bize donduren bir method olusturun.


    int [] kullaniciArrayi=arrayOlustur();
        System.out.println(Arrays.toString(kullaniciArrayi));


    }
    public static int [] arrayOlustur() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen olusturulacak array'in boyutunu giriniz ");
        int length = scan.nextInt();
        int[] kullaniciArrayi = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Array'e eklenecek bir sayi giriniz ");
            kullaniciArrayi[i] = scan.nextInt();
        }
        return kullaniciArrayi;
}}
  /*
public static int[] arrayOlustur(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Olusturulacak array'in boyutunu giriniz");
        int length= scan.nextInt();
        int[] kullaniciArrayi= new int[length];
        for (int i = 0; i <length ; i++) {
        System.out.println("array'e eklenecek bir sayi giriniz");
        kullaniciArrayi[i]= scan.nextInt();
        }
        return  kullaniciArrayi;
        }
        }*/