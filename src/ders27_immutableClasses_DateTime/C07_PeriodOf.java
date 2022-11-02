package ders27_immutableClasses_DateTime;

import java.time.LocalDate;
import java.time.Period;

public class C07_PeriodOf {
    public static void main(String[] args) {


    // dogumunuzdan bugune ne kadar zaman gectik

    LocalDate bugun= LocalDate.now();
    LocalDate dogumGunu= LocalDate.of(1977,9,16);

    Period gecenSure= Period.between(bugun,dogumGunu);

        System.out.println(gecenSure);
        System.out.println(gecenSure.getYears());





    }


}
