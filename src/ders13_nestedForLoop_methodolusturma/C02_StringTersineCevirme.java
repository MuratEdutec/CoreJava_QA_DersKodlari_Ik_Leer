package ders13_nestedForLoop_methodolusturma;

public class C02_StringTersineCevirme {
    public static void main(String[] args) {


        String input= " Java her gecen gun guzellesiyor";
        String tersInput= "";

        for (int i= input.length()-1; i >= 0; i--){
            tersInput += input.substring(i, i+1);
           // System.out.println(tersInput);      her birini tek tek aliyor
         }

        System.out.println("Ter hali : " + tersInput);
    }




}
