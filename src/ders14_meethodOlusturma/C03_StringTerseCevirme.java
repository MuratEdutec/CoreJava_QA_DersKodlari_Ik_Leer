package ders14_meethodOlusturma;

public class C03_StringTerseCevirme {

    // parametre olarak bir String kabul edip
    // String'in terse cevrilmis halini donduren bir method olusturun


    public static void main(String[] args) {
        String input="java kod yazdikca ogrenilir";

        System.out.println(stringiTersCevir(input));
    }

    public static String stringiTersCevir(String input){
        String tersStr= "";
        for (int i=input.length()-1; i>=0; i--){
            tersStr=tersStr+input.charAt(i);
        }
        return tersStr;
    }
}
