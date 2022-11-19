package ders40_Interfaces;

public interface I02_ConcreteChildClassOFInterface extends I01_Interface{
    public static void main(String[] args) {


        System.out.println(MESAJ);

    // sayi=40;  yazili olmasada Interdace icerisinde oldugundan
    //           final 'dir ve atama yapilamaz

        System.out.println(Integer.MAX_VALUE);
    // normalde variable isimleri, kucuk harfle baslar ve camelCase ile devam eder
    // ancak java da ortak kabul olarak
    // static ve final olarak isaretlenen variable isimleri tamamen buyuk harfle yazilir

        System.out.println(Math.PI);

}
}
