package ders40_Interfaces;

public interface I03_InterfaceChildOfInterface extends I01_Interface {
    // Eger bir interface'i baska bir interface'in child'i yapmak isterseniz
    // extend keywoord kullanilir.

    // Bir interface concrete class'i INHERIT EDEMEZ


    @Override
    void method1();
    // interface bir child parent interface'indeki
    // abstract method'u override edilebilir ama
    // ikisininde body'si olmadigindan
    // bu islemin bir anlami yoktur

    int method4();
    boolean method5();




}
