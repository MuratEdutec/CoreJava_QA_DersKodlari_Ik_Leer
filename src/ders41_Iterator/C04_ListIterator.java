package ders41_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C04_ListIterator {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        // iterator kullarak, listenin elementlerini sondan basa dogru yazdirin
        ListIterator lit=sayilar.listIterator();
        //once itertor'i sona goturelim

        while (lit.hasNext()){
            lit.next();
        }
         // simdi sondan basa dogru gidelim,giderken elementleri yazdiralim

        while(lit.hasPrevious()){
            System.out.print(lit.previous()+" ");
        }
        System.out.println("");
        System.out.println(lit.nextIndex());
        // eger iterator'u nerede biraktigimiz hatirlayamazsak
        // iterator.nextIndex() ile hangi indexin oncesinde oldugumuzu gorebiliriz

        // iterator kullanarak listenin tum elementlerini 5 arttrin

        while (lit.hasNext()){

            lit.set((Integer)lit.next()+5);


        }
        System.out.println(sayilar);


        // iterator kullanarak 40' kucuk olan elementleri silin
      //  Integer element;
        while (lit.hasPrevious()) {
            if ((Integer) lit.previous() < 40) {

                lit.remove();
            }
        }
        System.out.println(sayilar);


    }
}
