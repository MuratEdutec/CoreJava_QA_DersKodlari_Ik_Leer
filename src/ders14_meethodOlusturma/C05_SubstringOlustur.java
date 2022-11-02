package ders14_meethodOlusturma;

public class C05_SubstringOlustur {

    /* Soru 1- Kullanicidan input olarak verilen bir String,
    baslangic ve bitis indexlerine gore baslangic index’i dahil, bitis index’i haric olacak sekilde
    aradaki harfleri yazdiran bir method olusturun.
    - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
    - kullanici str’da olan index’lerden daha buyuk bir index girerse hata mesaji yazdirin.

     */

    public static void main(String[] args) {
        String input= "Java ne kadar guzel";
        int basIndexi=5;
        int bitisIndexi=7;

        kendiSubstringMethodumuz(input, basIndexi, bitisIndexi);
        kendiSubstringMethodumuz("Java", 1,3);
        kendiSubstringMethodumuz("Deneme", 6,3);//Baslangic indexi, bitis indexinden buyuk olamaz
        kendiSubstringMethodumuz("Java", 6,8);// Bitis indexi Stringin sinirlari disinda




    }
    public static void kendiSubstringMethodumuz(String input, int basIndexi, int bitisIndexi){

        if(basIndexi>bitisIndexi){
            System.out.println("Baslangic indexi, bitis indexinden buyuk olamaz");
        }else if (bitisIndexi>=input.length()){
            System.out.println("Bitis indexi Stringin sinirlari disinda");
        }else {
            //baslangic ve bitis indexlerine gore baslangic index’i dahil,
            // bitis index’i haric olacak sekilde
            // aradaki harfleri yazdiran bir method olusturun.
            for (int i=basIndexi; i<bitisIndexi;i++){
                System.out.print(input.charAt(i));
            }
            System.out.println("");
        }




    }






}
