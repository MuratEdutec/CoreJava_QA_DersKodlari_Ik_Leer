package ders31_inheritance;

public class DOtomobil extends BinekArac{

    public static void main(String[] args) {

        DOtomobil oto1=new DOtomobil();
        System.out.println(oto1.marka);

        //inheritance sayesinde bir child class olusturdugunuz da
        //yeni hicbir variable yada method olusturmadan
        // parent class(lar)' daki tum ozellikleri almis oluruz
        // child class'da parent'dan gelen ozellikleri
        // update edebilir veya yeni ekleyebiliriz


    }


}
