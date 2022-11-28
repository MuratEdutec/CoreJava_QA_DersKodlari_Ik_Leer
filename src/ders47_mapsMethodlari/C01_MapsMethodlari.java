package ders47_mapsMethodlari;

import java.util.HashMap;
import java.util.Map;

public class C01_MapsMethodlari {
    public static void main(String[] args) {

        Map<String, Integer> mp1= new HashMap<>();

        mp1.put("A",5);
        mp1.put("B",3);
        mp1.put("C",7);
        //mp1.put("D",9);


        System.out.println(mp1.putIfAbsent("D", 9));
        System.out.println(mp1);

        System.out.println(mp1.putIfAbsent("D", 15));

        /*
        putIfAbsent(K,V)    eger K daha once yoksa ekler ve null doner
                            eger K daha once varsa, istedigimiz yeni degeri eklemez
                            ve eski var olan degeri bize dondurur
         */

    Map<Integer, String> mp2=new HashMap<>();//null
    mp2.put(2,"S");
        System.out.println(mp2.putIfAbsent(3, "S"));//null

        System.out.println(mp2);//{2=S, 3=S}


        System.out.println(mp2.putIfAbsent(3, "Z"));//S
        System.out.println(mp2);//{2=S, 3=S}
    }
}
