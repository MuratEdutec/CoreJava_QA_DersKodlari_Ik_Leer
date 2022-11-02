package ders17_Scope;

public class C05_ObjectVariables {
    public static void main(String[] args) {

        // C03 class'indaki instance variable'lara nasil ulasabiliriz?
        // instance variable'larin diger adi obje variable'lardir
        // instance variable'lara obje uzerinden ulasabiliriz


        C03_ObjectVariables pers1= new C03_ObjectVariables();

        System.out.println(pers1.persIsmi);// Isim girilmedi
        System.out.println(pers1.persYasi);// 0

        pers1.persIsmi= "Suleyman";
        pers1.persYasi=35;
        pers1.persTelefonu="565987212";

        System.out.println(pers1.persIsmi);
        System.out.println(pers1.persYasi);

        C03_ObjectVariables pers2= new C03_ObjectVariables();
        pers2.persIsmi= "Latife";
        pers2.persYasi=32;
        pers2.persTelefonu="5553365899";

        System.out.println(pers1.persIsmi);
        System.out.println(pers2.persIsmi);

        C03_ObjectVariables pers3= new C03_ObjectVariables();
        pers3.persIsmi="Heysem";
        pers3.persYasi=30;
        pers3.persTelefonu="55588989365";

        System.out.println(pers1.persIsmi);
        System.out.println(pers2.persIsmi);
        System.out.println(pers3.persIsmi);


    }
}
