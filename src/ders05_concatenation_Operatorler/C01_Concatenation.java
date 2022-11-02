package ders05_concatenation_Operatorler;

public class C01_Concatenation {
    public static void main(String[] args) {
        //sadece asagida verilen variable'lari kullanarak istenilen degerleri yazdiralim


        String s1="Java";
        String s2="Guzeldir";
        String s3="";
        String s4=" ";

        int sayi1= 4;
        int sayi2= 3;
        //Java Guzeldir 7
        System.out.println(s1+s4+s2+(sayi1+sayi2));
        //Java Guzeldir 12
        System.out.println(s1+s4+s2+sayi1*sayi2);
        //7 Java Guzeldir
        System.out.println(sayi1+sayi2+s1+s4+s2);
        //34 Jva Guzeldir
        System.out.println(s3+sayi2+sayi1+s1+s4+s2);
        //Java7 Guzeldir 43

        System.out.println(s1+(sayi1+sayi2)+s4+s2+s4+sayi1+sayi2);











    }

}
