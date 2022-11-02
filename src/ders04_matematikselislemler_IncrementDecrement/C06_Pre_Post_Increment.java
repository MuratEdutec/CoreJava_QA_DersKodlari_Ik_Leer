package ders04_matematikselislemler_IncrementDecrement;

public class C06_Pre_Post_Increment {

    public static void main(String[] args) {

        int a=10;
        //a variable'nin degerini yazdiri, sonra a'nin degerini 1 artirin

        System.out.println("a:"+a);
        a++;

        //b variable'nin degerini bir artirin sonra yazdirin,

        int b=10;
        b++;
        System.out.println("b:"+b);



        int c=10;
        //a variable'nin degerini yazdiri, sonra a'nin degerini 1 artirin

        System.out.println("c:"+ c++);//10

        int d=10;
        //a variable'nin degerini yazdiri, sonra a'nin degerini 1 artirin

        System.out.println("d:"+ ++d);//11


        /*
        c++ veya ++d yi yazdirma yada atama isleminde kullanirsaniz
        c++ 'e post increment denir- o satir icin once islemi yapar sonra artirmayi yapar
        ++d 'ye ise pre increment denir- once artirma yapip sonra islemi yapar

        islemin oldugu satirin bir alt satirana gecildiginde
        c'de de'de bir artmistir



        */





    }


}
