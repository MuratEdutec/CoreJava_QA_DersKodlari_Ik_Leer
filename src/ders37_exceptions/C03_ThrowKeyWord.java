package ders37_exceptions;

public class C03_ThrowKeyWord {
    public static void main(String[] args) {


        int sayi = 1;
        System.out.println(sayi);


        try {
            sayi = 2;
            if (sayi == 2) {
                throw new RuntimeException();
            }


            sayi = 3;


            sayi = 4;


            sayi = 5;
        } catch (RuntimeException e) {

        }
        sayi = 6;
        System.out.println(sayi);
    }
}
