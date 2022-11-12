package ders35_exception;

public class C02_ArithmeticException {
    public static void main(String[] args) {

        //Verilen iki tamsayiyi birbirine bolup
        //sonucun tam sayi kismini yazidirin
        //

        int sayi1=20;
        int sayi2=0;
        try {
            System.out.println(sayi1/sayi2);
        } catch (ArithmeticException e) {
            // catch (Exception)
            System.out.println("Sayi sifira bolunemen");
            // catch (O'dan sonraki { } catch blogu denir
            // beklenen risk gerceklesirse calisacak kodlar

  //          throw new RuntimeException(e);
        }

        /*
        Bazi exception'lar if else ile handle edilebilir ancak
        tum exception'lar icin if else yeterli olmaz
         */


    }
}
