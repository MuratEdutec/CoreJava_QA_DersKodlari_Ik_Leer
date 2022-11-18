package ders39_AbstractClass;

public class CHondaCivic extends BHonda {


    @Override
    public void motor() {
        System.out.println("Honda civic araclar vtec teknolojili cevreci motorlar kullanir");
    }

    @Override
    public void kasa() {
        System.out.println("Civic araclar sedan veya hatchback kasa kullanir");

    }

    @Override
    public void tekerlek() {
        System.out.println("Civic araclar R155x90");

    }

    @Override
    public void yakit() {

        System.out.println("Civic araclar benzinlidir");

    }

    @Override
    public void guvenlik() {

        System.out.println("Civic araclar guvenlik standardina uyar");

    }

    public static void main(String[] args) {
        CHondaCivic civic1= new CHondaCivic();

        civic1.abs();
        civic1.klima();
        civic1.marka();
        civic1.ozelTeknoloji();















    }



}
