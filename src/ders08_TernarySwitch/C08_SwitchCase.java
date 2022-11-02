package ders08_TernarySwitch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C08_SwitchCase {
    public static void main(String[] args) {

        //Kullanicidan ay numarasini alip mevsimi yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("Ay numarasi girin");
        int ayNO=scan.nextInt();

        switch (ayNO){

            case 12 :
            case 1 :
            case 2 :
                System.out.println("Kis");
            break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Ilkbahar");
                break;

            case 6 :
            case 7 :
            case 8 :

                System.out.println("Yaz");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Gecersiz giris");

        }






    }
}
