package ders10_stringManipulation;

public class C02_Contains {

    public static void main(String[] args) {

        String str= "Java ile kodlama cok zevkli";

        //str.contains("cok");
        //CharSquence : Char dizisi

        System.out.println(str.contains("cok"));// true
        System.out.println(str.contains("a")); //true
        System.out.println(str.contains("s"));//false
        System.out.println(str.contains("java")); // false --> kucuk harf/case sensetive

        String str2= "Java";
        System.out.println(str.contains(str2));//true

        String str3= "234 Ali Can";
        System.out.println(str3.contains("2"));


    }

}
