package ders30_encapsulation;

public class C01_Encapsulations {
    public static void main(String[] args) {

        AEncapsuleClass pers1= new AEncapsuleClass();
        // pers1.hastaneIsmi="Java Hastanesi"; provate oldugu icin gorulemez

        // pers1.hastaUcreti=10000 private oldugu icin kullanilmaz

        // pers1.hemsireAdresi="Ankara";      private oldugundan ulasilamaz
        // pers1.hemsireIsmi="Yildiz Yildiz"; private oldugundan ulasilamaz

        // pers1.getHastaneIsmi()="Java Hastanesi"; herhangi bir atama yapilamaz SADECE DEGERI GETIRIR
        System.out.println(pers1.getHastaneIsmi());

        pers1.setHastaUcreti(500);

        // getter ve setter method'lari
        // bazende erisimi sinirlandirmak icin  degik
        // kullanicilarin islevi iyi anlamasi icin kullanilir


        System.out.println(pers1.getHemsireAdresi());
        pers1.setHemsireAdresi("Istanbul");
        System.out.println(pers1.getHemsireAdresi());


    }
}
