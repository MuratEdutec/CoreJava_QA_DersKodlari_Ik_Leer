package ders34_pollymorphism;

public class BChild extends AParent{
    public void method1(){
        System.out.println("child class method1 ");

    }
    public void method2(int a){

        //overriding olabilmesi icin
        // hem method ismi hem de signature ayni olmalidir


        System.out.println("Child class method2 ");

    }

    public void method2(String isim){
        System.out.println("Child class String parametrerli method2 ");

    }
    @Override
    public void method3(String str) {

    //super.method3(str);
    // Overriding varsa parent ve child class'daki
        //overridden ve overiding method'lardan sadece biri calisir
        //eger ikisini birden calistirmak isterseniz
        // super.overiddenMethoddIsmi yazilir

        /*
        Overriding method @Override notasyonu ile isaretlenebilir
        @Override kullanilmayan overriding isleminde,
        parent class'daki overridden method silinirse
        hicbir sorun omaz.


        @Override kullanilan overriding isleminde,
        parent class'daki overridden method silinirse veya
        signature'i degistirilirse
        Java CTE verir, boylece overridden method'un silinmesi engellenir


         */

    //
}


}

