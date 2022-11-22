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

        System.out.println("__________");
        System.out.println(q1.remove("K"));//true
        System.out.println(q1);//[Y]

        System.out.println("-__________");
        q1.remove();  // bos queue kaldi []
        System.out.println(q1);//[]
        //q1.remove();// Tekrar yazilirsa ---queue bos oldugundan NoSuchElementException verir

        System.out.println("__________");

        System.out.println(q1.poll());
        // .poll(); remove ile aynı işlemi yapar , yan bastakı elementi siler bize
        // dondurur aralarındaki fark bos Queue 'da calıstırıldıklarında remove exception
        // fırlatırken poll() exceptıon fırlatmaz.

        q1.add("H");
        q1.add("Y"); // [H, Y]

        System.out.println(q1.peek());
        // silmeden queue'nun basindaki elementi bize getiriyor
        // eger queue bossa null getiriyor

        System.out.println(q1);
        System.out.println("__________");

        System.out.println("element : " + q1.element());
        System.out.println(q1);
        System.out.println("__________");
        q1.clear();// queue'yi bosalttik

        System.out.println("peek : "+ q1.peek()); //null

        //System.out.println("element : " + q1.element()); // exception



    }
}
