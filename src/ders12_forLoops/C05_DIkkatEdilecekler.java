package ders12_forLoops;

public class C05_DIkkatEdilecekler {
    public static void main(String[] args) {

        /* SONSUZ loop

        for (int i=0;  i>-10; i++){
            System.out.print(i+" ");
        }
         */
/*
        // ilk deger icin bitis sarti true olmuyorsa
        // for body'si hic devreye girmez


        for (int i=0;  i>10; i++){
            System.out.print(i+" ");

        }
*/
        // bir loop'u sonunu beklemeden bitirmek istersek

        //kullanicidan verdigi bir sayinin asal olup olmadigini bulun
        //-- ASAL sayi : 1 ve kendisi disinda hic bir tamsayiya tam bolunmeyen sayi

        int sayi= 5300;
        //boolean asalMi=false;
        boolean bayrak=false;


        for (int i= 2; i <= sayi-1 ; i++) {

            if (sayi % i == 0) {
                //askimiz bitti
                bayrak=true;
                break;
            }
        }
        System.out.println(bayrak);

        if (bayrak){
            System.out.println("asal sayi");
        }else {
            System.out.println("asal degil");
        }













    }
}
