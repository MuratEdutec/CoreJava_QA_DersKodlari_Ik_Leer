package ders18_Arrays;

public class C07_EnKisa_EnUzunKelime {
    // Verilen String bir array’deki
    // en uzun ve en kisa kelimeleri yazdiran bir method olusturun.
    public static void main(String[] args) {


        String [] arr={"Hasan","Ilker","Senturk","Omer Faruk"};

        enUzunenKisaIsimYazdir(arr);

    }

    public static void enUzunenKisaIsimYazdir(String[]arr){

        String enuzunKelime=arr[0];
        String enkisaKelime=arr[0];

        for (int i = 1; i < arr.length ; i++) {
            if(arr[i].length()>enuzunKelime.length()){
                enuzunKelime=arr[i];

            }
            if(arr[i].length()<enkisaKelime.length()){  // <= ise siradaki islem gecerli olur siradaki ismi alir
                enkisaKelime=arr[i];
            }
        }
        System.out.println("En uzun isim "+ enuzunKelime);
        System.out.println("En kisa isim " + enkisaKelime);

    }

}

