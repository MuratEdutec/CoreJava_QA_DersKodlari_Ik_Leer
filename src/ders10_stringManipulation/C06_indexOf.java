package ders10_stringManipulation;

import java.sql.SQLOutput;

public class C06_indexOf {
    public static void main(String[] args) {

        String str="Ahmet hoca ile hersey clear";

        System.out.println(str.indexOf("a"));//9 ilk a'nin index'ini dondurur

        System.out.println(str.indexOf('c'));//8

        System.out.println(str.indexOf("hersey"));//

        System.out.println(str.indexOf("e",9));//13

        //13. index'teki e'den bir sonraki e'nin index'ini bulalim
        System.out.println(str.indexOf("e",13));//13
        System.out.println(str.indexOf("e",14));//13

        //cumledeki 2. c'nin index'ini yazdirin
        int ilkcindexsi= str.indexOf("c");//8
        System.out.println(str.indexOf("c", ilkcindexsi + 1));//22

        System.out.println(str.indexOf("ali"));//-1 index olarak int donmesi bekleniyor
        System.out.println(str.indexOf("x"));//-1
    }

}
