package ders34_pollymorphism;

public class DChild extends CParent{

    //Overriding kurallari
    // 1- acces modifier method signature dahil olmadigindan
    // overridden ve overriding access modifier'lar farkli olabilir
    // child parent'i sinirlandiramaz
    // yani overriding method'in acces modifier'i daha genis kapsamli olmalidir
    // ayni veya daha genis kapsamli olmalidir
    // (dar kapsam        private < default < protected < public  (genis kapsam
    //
    public void method1(){

    }

    //2- private ve static method'lar override edilemez
    //ayni isimde method olusturulunca java CTE vermez
    //ancak override isareti cikmaz ve
    // @Override notasyonu kullanilmak istenirse CTE olur
    // yani Java bunlari farkli class'lardaki farkli method'lar olarak kabul eder
    // '

    public static void method2(){

    }
   private void method3(){

   }

   // 3-return type method signature'ina dahil olmadigindan
    // farkli secilebilir
    // return type void veya primitive ise ayni olmak zorundadir
    // Eger return type'lar non-primitive ise
    // Child class'daki return type, parent class'daki return typ'in
    // ile ayni veya child'i olmalidir.

    public void method4(){

    }

    public String method5(){
        return " ";
    }










}
