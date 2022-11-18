package ders39_AbstractClass;

public abstract class Araba {
        // Araba class'ini inherit eden tum class'lar
        // motor, kasa ve tekerlek method'larini override etmek zorunda kalsin
    public abstract void motor();

    public  abstract void kasa();

    public abstract void tekerlek();
    public void abs(){
        System.out.println("Guvenlik artirmak icin abs takin ");
    }

    public void klima(){
        System.out.println("Konfor artirmak icin klima takin ");
    }

}