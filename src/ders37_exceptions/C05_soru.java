package ders37_exceptions;

public class C05_soru {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        try {
            System.out.println(a / b);
            try {
                Object c = a / b;
                String d = (String) c;


            } catch (ClassCastException e) {
                throw new RuntimeException();

            }
        } catch (RuntimeException e) {
            System.out.println("throw keyword");
        }
    }
}