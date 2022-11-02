package ders18_Arrays;

public class C05_ArrayElemanArama {

    public static void main(String[] args) {
    //Verilen bir array’de istenen bir elemanin var olup olmadigini
    // ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr = {1,2,4,5,3,6,7,4,2,3,5,1,3,2};
        int arananEleman=4;
        elemanAra(arr,arananEleman);//3
    }
    public static void elemanAra(int[] arr, int arananElaman){

        int sayac=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==arananElaman){
                sayac++;
            }

        }
        if(sayac==0){
            System.out.println("Aranan sayi array'de yok");
        }else {
            System.out.println("Aranan "+arananElaman+" sayisi, array'da "+ sayac+ " defa kullanilmis");
        }






    }
}
