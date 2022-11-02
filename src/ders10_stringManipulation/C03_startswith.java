package ders10_stringManipulation;

public class C03_startswith {
    public static void main(String[] args) {
        String str= "manti acarken java ogrenilmez";

        System.out.println(str.startsWith("Manti"));//false -->> CASE SENSETIVE

        System.out.println(str.startsWith("m"));//true
        System.out.println(str.startsWith("manti acarken java ogrenilmez"));

        System.out.println(str.startsWith(""));//hiclik oldugundan true doner!!! (bosluk degil hiclik
        System.out.println(str.startsWith(" "));//bosluk oldugundan --false-- doner!!!


        System.out.println(str.startsWith("acarken", 6));//true
        System.out.println(str.startsWith("manti", 0));//true
        System.out.println(str.startsWith("java", 0));//false







    }
}
