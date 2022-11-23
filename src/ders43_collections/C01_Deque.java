package ders43_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {
    public static void main(String[] args) {
        Deque<String> dq1=new LinkedList<>();

        dq1.add("K");
        dq1.add("B");
        dq1.addLast("F");//[K, B, F]
        dq1.addFirst("A");//[A, K, B, F]

        System.out.println(dq1.getFirst()); // A
        System.out.println(dq1.getLast());// F

        System.out.println(dq1.poll());//A
        System.out.println(dq1.remove());//K
        System.out.println(dq1.removeLast());//F
        System.out.println(dq1.remove());//B
        System.out.println(dq1.poll());//null
        //  bos deque olmasina ragmen exeption firlatmaz , eleman silemedigi icin bize null dondurur

        dq1.add("K");
        dq1.add("B");
        dq1.push("F");// [F, K, B]
        //deque 'in basina element ekler
        // eger deque ile ilgili sinirlandirma varsa ve yer kalmamissa
        // illegalStateException verir


        System.out.println("pop--> "+dq1.pop());// F ilk elementi siler ve bize dondururu removeFirst ile ayni islevi gorurur
        System.out.println(dq1);


        System.out.println("element--> "+dq1.element());// ilk elementi bize silmeden dondurur bos dequ'de calisirsa exception firlatir

        System.out.println("peek--> "+dq1.peek()); //K ilk elementi bize silmeden dondurur bos dequ'de calisirsa null
        System.out.println("peek first--> "+dq1.peekFirst());
        System.out.println("peek last--> "+dq1.peekLast());
        System.out.println("offer--> "+dq1.offer("C")); //true [K, B, C]
        System.out.println("offer first--> "+dq1.offerFirst("M")); //true [M, K, B, C]

        System.out.println(dq1);




    }



}
