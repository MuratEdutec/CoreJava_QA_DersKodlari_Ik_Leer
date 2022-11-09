package ders32_inheritanceConstructorCall;

public class BToyota extends Araba{
    BToyota(){
        System.out.println("Parametresiz Toyota constructor");
    }
    BToyota (int pt){
        System.out.println("Parametreli Toyota constructor");
    }
    BToyota(String pt2){
        super("Mehmet");
        System.out.println("String paremetreli toyota constructor");
    }
}
