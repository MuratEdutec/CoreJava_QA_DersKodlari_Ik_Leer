package ders27_immutableClasses_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class C07_DogumTarihi {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Dogumunuzdan bugune ne kadar zaman gecti!!!");
        Scanner scan= new Scanner(System.in);
        System.out.print("Dogum Gununuz --> ");
        Thread.sleep(5000);
        int gun= scan.nextInt();
        System.out.print("Dogum Ayiniz --> ");
        int ay= scan.nextInt();
        System.out.print("Dogum Yiliniz --> ");
        int year= scan.nextInt();

    LocalDate bugun= LocalDate.now();
    LocalDate dogumGunu= LocalDate.of(year, ay, gun);

    Period gecenSure= Period.between(bugun,dogumGunu);

        //System.out.println(gecenSure);
        System.out.println("Dogum gununuzden itibaren bugune kadar ...\n" +gecenSure.getDays()+ " gun "+ gecenSure.getMonths()+" ay "+gecenSure.getYears()+" yil" );





    }


}
