package ders18_Arrays;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String [] arr={"Ali","Ulus","Nesrin"};

        // Bu array'in tum elementlerini aralarinda bir bosluk birakarak yazdiralim

        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        // bu array'i array olarak yazdiralim
        System.out.print(arr);
        // array bir obje / nonprimitive data oldugundan java referansini yazdirir
        // array'i array olarak yazdirmak isterseniz Arrays class'indan yardim almalisiniz
        System.out.println("");

        System.out.println(Arrays.toString(arr));









    }
}
