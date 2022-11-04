package stringBuilders_AccessModifier;

import java.util.ArrayList;
import java.util.List;

public class C06_Encapsulation {
    /*
    Buyuk projelerdeki gorm (read) ve ya datayi degistirme (write)
    yetkilerini birbirinden bagimsiz olarak duzenlemek istenebilir

    Access modifier ile class uylerine baska class'lardan erisim sinirlandirilabililir
    ANCAK
    ulasilabilen dataya hem okuma hem yazma yapilabilirken
    ulasilamayan data ne okunabilir ne de degistirilebilir

    gercek hayattaki ihtiyaclar dusunuldugunde
    Java'ya yetki sinirlamayi uyarlamak istersek

    - Eger okuma ve yazma yetkisini birlikte vermek ve vermemek soz konusu ise
    access modifier kullanilir

    - Eger okuma ve yazma yetkileri birbirinden ayrilicaksa
    o zaman access modifier yeterli olmaz
    Encapsulation(getter ve setter method'lari kullanilmalidir)

     */

    public static void main(String[] args) {
        List<Integer> sayilar= new ArrayList<>();

        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(5);

       // sayilar.get(1)=10; get okumaya izin var maa deger atamaya (yazmaya) izin yok

       /// System.out.println(sayilar.set(1)); set varsa MUTLAKA deger atamalisin



    }




}



