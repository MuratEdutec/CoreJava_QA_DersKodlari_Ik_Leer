package ders20_multiDimensionArrays;

import java.util.Arrays;

public class C05_MDA_Soru {
    public static void main(String[] args) {

        // Verilen 2 katli bir array’de bulunan
        // tum sayilarin carpinini bize donduren bir method olusturun

    int [][] arr= {{5,7},{5,8,9},{0,1}};  // carpimda 0 oldugu icin sonuc her zaman 0....

        System.out.println(arraydekilerCarpim(arr));


    }

    public static int arraydekilerCarpim(int [][] arr){
        int carpim=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpim *= arr[i][j];

                }

        }
        return carpim;

    }
}
