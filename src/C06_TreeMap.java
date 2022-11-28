import java.util.TreeMap;

public class C06_TreeMap {

    public static void main(String[] args) {

        TreeMap<String, Integer> mp1= new TreeMap<>();

        mp1.put("A",5);
        mp1.put("H",3);
        mp1.put("C",7);
        mp1.put("T",3);
        mp1.put("F",8);
        System.out.println(mp1);

        System.out.println("---------Higher Key---------");
        System.out.println(mp1.higherKey("D")); //F
        System.out.println(mp1.higherKey("H")); //T
        System.out.println(mp1.higherKey("U")); //null


        System.out.println("---------Floor Entry---------");
        System.out.println(mp1.higherEntry("M")); //T=3
        System.out.println(mp1.floorKey("D")); //C
        System.out.println(mp1.floorKey("H")); //H
        System.out.println("Floor Entry  "+mp1.floorEntry("L"));//H=3
        System.out.println("Floor Entry  "+mp1.floorEntry("T"));//T=3


        System.out.println("---------Head Map---------");
        System.out.println(mp1.headMap("F")); //{A=5, C=7}
        System.out.println(mp1.headMap("F", true));//{A=5, C=7, F=8}
        System.out.println(mp1.headMap("K")); //{A=5, C=7, F=8, H=3}

        System.out.println("---------Tail Map---------");
        System.out.println(mp1.tailMap("F"));//{F=8, H=3, T=3}
        System.out.println(mp1.tailMap("D"));//{F=8, H=3, T=3}
        System.out.println(mp1.tailMap("F", false));//{H=3, T=3}

        System.out.println("---------Ceiling  Key---------");

        System.out.println(mp1.ceilingKey("F"));// F girilen deger esit veya buyuk olan
        System.out.println(mp1.ceilingKey("B")); //
        System.out.println(mp1.ceilingEntry("H")); // H=3


    }
}
