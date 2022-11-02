package ders20_multiDimensionArrays;

import java.util.Arrays;

public class C01_MultiDimensionalsArrays_MDA {
    public static void main(String[] args) {

        /* int[][] arr= {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        System.out.println(arr[1][1]);//2      --->>INTEGER ELEMENTLER
        System.out.println(arr[2][0]);//3
        System.out.println(arr[4][1]);//7

        System.out.println(Arrays.toString(arr[1])); // --->>> INNER ARRAYS
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.deepToString(arr)); //---->>>> OUTER ARRAYS
        */




        int [][] arr= {{4,3,1},{1,2},{5,6,7},{},{3,6,8,0}};

        System.out.println(arr.length);//5

        System.out.println(arr[2].length);// [5,6,7] ==> length=3

        System.out.println(arr[1]);//[1,2]==> direk yazdirmaz, java referansini yazdirir
        System.out.println(Arrays.toString(arr[1]));//[1,2]

        // TUm array i yazdirmak icin

        System.out.println(Arrays.deepToString(arr));

        //System.out.println(arr[3][0]);

    }
}
