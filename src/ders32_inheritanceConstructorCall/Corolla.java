package ders32_inheritanceConstructorCall;

public class Corolla extends BToyota{
    Corolla(int pc){
        super(5);
        System.out.println("Parametreli Corolla constructor");


    }

    Corolla(){
        //System.out.println("Parametresiz Corolla constructor");
    }

    Corolla(String str){
        this();
        System.out.println("String parametreli Corolla constructor");

    }



    public static void main(String[] args) {

        Corolla corolla3=new Corolla("Ilker");







        System.out.println("==========================================");
        Corolla corolla1=new Corolla();
        //Parametresiz Araba constructor
        // Parametresiz Toyota constructor

        System.out.println("==========================================");
        Corolla corolla2=new Corolla(3);
        //Parametresiz Araba constructor
        //Parametresiz Toyota constructor
        //String parametreli Corolla constructor



    }


}
