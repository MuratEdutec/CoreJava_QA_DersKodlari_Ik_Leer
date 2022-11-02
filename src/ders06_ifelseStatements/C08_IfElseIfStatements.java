package ders06_ifelseStatements;

import java.util.Scanner;

public class C08_IfElseIfStatements {
    public static void main(String[] args) {
        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        // kenar uzunluklari 0 ve negatifse gecersiz kenar uzunlugu yazdirin
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenarini giriniz");

        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if (kenar1<=0 || kenar2<=0 || kenar3<=0 ){
            System.out.println("Gecersiz kenar uzunlugu");
        }
        else if (kenar1==kenar2 && kenar2==kenar3) {
            System.out.println("eskenar ucgen");
        }
                else
        {
            System.out.println("Eskaner Degil");
        }

    }


}
