package ders28_varargsstringBuilder;
public class C02_Varargs {

public static void main(String[]args){


    topla(5,6);
    topla(5,3,8);
    topla(5,3,8,9);


    /*
    Bir method'a parametre sayisini sinirlandirmak istemezsek
    standart bir variable yerine vrargs kullaniriz

    varargs data turunun yanina ... (uc nokto) konularak deklare edilir
    int... ==> sayisi berlirli olmayan int parametreler alan bir array' dir
     */

}

public static void topla(int... sayilar) {
    int toplamSonuc=0;
    for (int each: sayilar

         ) {
        toplamSonuc+=each;

    }
    System.out.println(" Girilen sayilarin toplami " + toplamSonuc);

}
}

