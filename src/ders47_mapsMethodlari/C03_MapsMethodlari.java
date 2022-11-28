package ders47_mapsMethodlari;

import java.util.HashMap;
import java.util.Map;

public class C03_MapsMethodlari {

    public static void main(String[] args) {


        Map<String, Integer> mp1= new HashMap<>();

        mp1.put("A",5);
        mp1.put("B",3);
        mp1.put("C",7);
        System.out.println(mp1);
        // C key olarak varsa degerini 3 artir

        if(mp1.containsKey("C")){
            mp1.put("C", mp1.get("C")+3 );
        }
        System.out.println(mp1);

        // B key olarak varsa degerini 2 ile carp

        mp1.computeIfPresent("B", (k,v) -> 2*v);
        System.out.println(mp1);


        // Map' D yoksa Valuesi olarak 11 olacak sekilde ekleyelim

        if(!mp1.containsKey("D")){
            mp1.put("D",11);
        }

        mp1.putIfAbsent("D",11);
        System.out.println(mp1);





    }
}
