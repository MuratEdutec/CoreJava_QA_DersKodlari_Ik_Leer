package stringBuilders_AccessModifier;

import java.sql.SQLOutput;

public class C03_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Java ne kadar guzel");

        System.out.println(sb.substring(4));// ne kadar guzel
        System.out.println(sb);

        // System.out.println(sb = sb.substring(0, 4)); esitligin solu StringBuilder, sagi ise String
        //                                              Java non-primitive datalarda casting yapmaz
        // Ayni not Integer, Byte ve Short gibi sayi barindiran non-primitive'ler icinde gecerlidir

        // sb guzel kelimesi iceriyor mu?
        /*
        String builder'da olmayan, String class'inda bulunan nethod'lari kullanmak isterseniz
        once toString() ile String'e cevirip, sonra String manipulation yapilabilir
         */

        System.out.println(sb.toString().contains("guzel"));
        System.out.println(sb); // String ile islem yaptigimizdan sb degismez...

        int total=0;
        StringBuilder letters= new StringBuilder("abcdefg");

        total += letters.substring(1,2).length();
        total += letters.substring(6,6).length();
        total += letters.substring(6,5).length();
        System.out.println(total);
    }
}
