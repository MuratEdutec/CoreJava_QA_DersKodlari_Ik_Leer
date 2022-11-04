package stringBuilders_AccessModifier;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_DateTimeFormatter {
    public static void main(String[] args) {

        /*
         format olustururken
         GUN
         d : basta 0 varsa onu yazmadan gun numarasi
         dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
         DDD : yilin kacinci gunu oldugunu yazar
         E, EE, EEE : gun isminin ilk 3 harfi
         EEEE : gun isminin tamamini

         AY (Ay icin M, dakika icin m kullanilir)
         M : basta 0 varsa onu yazmadan ay numarasi
         MM:dd: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
         MMM : Ay isminin ilk 3 harfi
         MMMM : Ay isminin tamami

         YY : yilin son iki rakamini
         YYYY : Yilin tamamini


         Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

         HH : saatin tamami, tek rakamli saat olursa 02 gibi
         H  : tek rakamli saat olursa sadece saati

         a yazarsak AM veya PM degerini yazar
         */
        LocalDateTime zaman=LocalDateTime.now();
        System.out.println(zaman); //2022-11-04T19:06:45.144414200

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/MM/YYY");

        System.out.println(zaman.format(dtf1));

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("d:MMM:YY");
        System.out.println(zaman.format(dtf2));

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("d:MMM:YY-DDD");
        System.out.println(zaman.format(dtf3));

        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("dEEE:MMM:YY-DDD");
        System.out.println(zaman.format(dtf4));

        DateTimeFormatter dtf5=DateTimeFormatter.ofPattern("dEEE:MMMM:YY-DDD");
        System.out.println(zaman.format(dtf5));

        DateTimeFormatter dtf6=DateTimeFormatter.ofPattern("d EEE MMM, YYY DD");
        System.out.println(zaman.format(dtf6));

        DateTimeFormatter dtf7=DateTimeFormatter.ofPattern("DD-d EEE MMM, YYY  HH.MM a");
        System.out.println(zaman.format(dtf7));


    }

}
