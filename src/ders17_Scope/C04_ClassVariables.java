package ders17_Scope;

public class C04_ClassVariables {

//-------------------------------------------------BUnun githubtan al
    public static void main(String[] args) {
        // C03 teki hastane ismini yazdirmak istesek


        System.out.println(C03_ObjectVariables.hastaneIsmi);
        System.out.println(C03_ObjectVariables.hastaSayisi);
        C03_ObjectVariables.hastaSayisi++;
        C03_ObjectVariables.hastaSayisi++;
        method1();

        System.out.println(C03_ObjectVariables.hastaSayisi);
    }

    public static void method1(){
        C03_ObjectVariables.hastaSayisi++;
    }


        /*
        Java Runtime programdir
        calismaya basladiginda variable'lara atanan degerleri isler

         */








}
