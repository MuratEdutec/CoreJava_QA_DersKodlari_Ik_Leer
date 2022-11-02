package ders04_matematikselislemler_IncrementDecrement;

public class C07_Pre_Post_Increment {

    public static void main(String[] args) {

        int a=10;
        int b=a++;
        int c=++b;


        System.out.println("a: "+ a + ",b: "+ b +",c: " + c);




        a=20;
        b=++a;//21
        c=a++;//21
        //a=22
        System.out.println("a: "+ a + ", b: "+ b +", c: " + c);


        a=30;
        System.out.println(a++);//yazilan 30 ama deger 31
        System.out.println(--a);//deger 31 -1 --30
        System.out.println(a--);//yazilan 30 ama deger 29
        System.out.println(a);//son deger 29








    }


}
