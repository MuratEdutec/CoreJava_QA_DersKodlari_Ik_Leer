package ders09_stringManipulations;

public class C07_substring {
    public static void main(String[] args) {



        String str= "Java gun gectikce guzellesiyor";
        System.out.println(str.substring(5, 8));

        // 5. indexten baslar (8-5) karakter yazdirir
        //5. index dahil (inclusive); 8. index haric (exclusive)


        //gectikce yazdirin
        System.out.println(str.substring(9, 17));//gectikce
        System.out.println(str.substring(3,7));//a

        String isim="hasan";
        //verilen ismi ilk harfi buyuk geriye kalanlar kucuk olarak yazdirin

        isim = isim.substring(0,1).toUpperCase()+ //ilk harfi alip buyuk harf yaptik
                isim.substring(1).toLowerCase();

        System.out.println(isim);


        isim="huseYIN";
        //verilen ismi ilk harfi buyuk geriye kalanlar kucuk olarak yazdirin

        isim= isim.substring(0,1).toUpperCase()+ //ilk harfi alip buyuk harf yaptik
                isim.substring(1).toLowerCase();

        System.out.println(isim);

        //sadece 3.indexteki harfi yazdirin e
        System.out.println(isim.substring(3,4));
        System.out.println("zor sorunun cevabi --hicliktir---: "+ isim.substring(2,2));//hiclik









    }
}
