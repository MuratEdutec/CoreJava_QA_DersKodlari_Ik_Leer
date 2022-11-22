package ders42_connections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedListQueueDataTuru {
    public static void main(String[] args) {


        Queue<String> q1= new LinkedList<>();

        q1.add("H");
        q1.add("Y");//[H, Y]

        q1.offer("K");
        System.out.println(q1);
        // kapasite sinirlamasi yapmadiginiz surece add() ile ayni islemi yapar

        //q1.remove( );  // Queue eklemeyi sona yapip kullanmayi bastan yaptigi icin
                       // parametre girmedigimizde bastaki elemani remove eder
        System.out.println(q1.remove());//parametre girmedigimizde bastaki elemani remove ettigi elemani dondurur
        System.out.println(q1);

    }
}
