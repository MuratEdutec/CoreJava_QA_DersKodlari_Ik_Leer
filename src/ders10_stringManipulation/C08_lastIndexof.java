package ders10_stringManipulation;

public class C08_lastIndexof {
    public static void main(String[] args) {


        String str= "Java hafiften beyin yakiyor";

        System.out.println(str.lastIndexOf("a"));//21
        System.out.println(str.lastIndexOf('e'));//15


        System.out.println(str.lastIndexOf("Java")); //0
        System.out.println(str.lastIndexOf("java")); //-1 CASE SENSETIVE
        System.out.println(str.lastIndexOf("e", 14));//11


    }
}
