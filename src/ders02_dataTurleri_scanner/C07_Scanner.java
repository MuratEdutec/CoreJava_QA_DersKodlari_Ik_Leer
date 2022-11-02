package ders02_dataTurleri_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;

public class C07_Scanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen adinizi giriniz");
        // string icin kullanilabilen next() sadece ilk space kadar olan kismi alir
        //                            nextLine() ise o satirda yazilan tum bilgiliaklir
        String isim= scan.nextLine();

        System.out.println("Lutfen Soyisminizi Yaziniz ");
        String soyisim= scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz ");
        double yas= scan.nextDouble();
        System.out.println("Isminiz: "+ isim +"\nSoyisminiz :"+ soyisim+
        "\nYasiniz: "+ yas + "\nKaydiniz basari ile tamamlandi");

    }
}
