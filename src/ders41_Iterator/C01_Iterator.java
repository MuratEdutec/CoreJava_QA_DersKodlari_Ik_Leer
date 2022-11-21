package ders41_Iterator;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {

        // java collections icersidindeki bazi class'lar index desteklemez
        // Bu durumda index kullanmadan collection icerisindeki tum elementlere ulasabilmek
        // ve onlari update edebilmek icin farkli ihtiyaclarimiz olur


        // Lis<> index yapisini destekledigi icin boyle bir ihtiyac duymaz
        // ancak bugunluk index kullanmadan list elementlerine ulasmaya ve onlari
        // update etmeye calisalim

        List<Integer> sayilar= new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        // System.out.println(sayilar);[10, 20, 30, 40]

        // index kullanmadan list'in tum elenemtlerini yazdirin

        for (Integer each:sayilar
             ) {
            System.out.print(each+" ");
        }
        System.out.println(" ");
        // index kullanmadan list'in elenemtlerini birebir arttirin
        // index kullanmadan list'in 25 ten buyuk sayilari list ten silin

        for (Integer each:sayilar
        ) {
            each++;
            System.out.print(each+" ");// sadece burada arttri, normal liste duruyor...
        }

        System.out.println(sayilar);//[10, 20, 30, 40]

    }
    /*
    Index kullanmadan list'in elemanlarini kalici degistirmek mumkun olmadi
    Java bunu icin Iterator interface'i olusturmustur.

     */



}
