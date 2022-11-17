package ders38_AbstractClasses;

public abstract class CParentAbstractClass {

        /*
        Abstact bir class abstract method'lara sahip olabilir
        Bir class'i abstract yapmak icin class declaration'ina abstract keyword eklenmelidir
         */

        public abstract void mecburiMethod1();
        public abstract void mecburiMethod2();
        // soyut (abstract) method'larin body'si olmaz

        public String concreteMethod(){
                //Bugune kadar kullandigimiz normal method'lara
                // soyut olmayan method demek yerine concrete method deriz
                return "";
        }








    /*
    Bir parent class'ta child class'larin mutlaka override edecegi bir method olusturdugumuzda
    method body'si gereksizlesir
    cunku hic calismayacaktir

    1- abstract parent clas'tan obje olusturulamayacagi icin objeler icin bu method kullanilamaz
    2- child class'larda mecburen override edeceklerinden,
    bu method'laron body'si asla KULLANMAYACAKTIR

    Java hic kullanilmayacak bu method body'leri yazmamamiza imkan tanimistir.

     */

        // Child class'larin mutlaka override etmesini istedigimize method'lari
    // abstract olarak tanimlar ve body'siz olarak olustururuz.



}

