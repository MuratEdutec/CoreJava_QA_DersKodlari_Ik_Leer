package ders27_immutableClasses_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class c04_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih= LocalDate.now();
        System.out.println(tarih);//2022-10-29
        System.out.println(tarih.minusDays(100));
        System.out.println(tarih.minusWeeks(5).minusDays(3));
        System.out.println(tarih.plusMonths(5).plusWeeks(2).plusDays(3));





    }
}
