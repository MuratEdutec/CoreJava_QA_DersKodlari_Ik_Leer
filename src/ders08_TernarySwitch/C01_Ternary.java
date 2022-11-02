package ders08_TernarySwitch;

import java.util.Scanner;

public class C01_Ternary {

    public static void main(String[] args) {


        //kullanicidan bir sayi alin
        //sayi pozitif ise 2 katini yazdirin
        //sayi pozitif degil ise sayiyay 10 ekleyip yazdirin

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");
        double sayi= scanner.nextDouble();

        if (sayi>0){
            System.out.println(sayi*2);
        }else {
            System.out.println(sayi+10);
        }



        System.out.println(sayi>0 ? 2*sayi : sayi+10);





    }
}
