package stringBuilders_AccessModifier;

public class C05_AccesModifier {
    public static void main(String[] args) {

        C04_AccessModifiers obj= new C04_AccessModifiers();
        obj.isim="Tugay";

        System.out.println(obj.isim);

        // private variable'lara baska class'tan ulasilamaz






        C04_AccessModifiers obj2= new C04_AccessModifiers();
        System.out.println(obj2.isim);// atama olmadigi icin default ismi alir


    }
}
