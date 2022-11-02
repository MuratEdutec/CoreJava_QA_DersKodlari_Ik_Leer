public class Deneme {

    String str = "a";



    Deneme() {

        str = str + "b";

    }

    Deneme(String c) {

        str = str + c;

    }

    public static void main(String[] args) {

        Deneme deneme1 = new Deneme("r");

        Deneme deneme2 = new Deneme();

        System.out.println(deneme1.str + deneme2.str);

    } }

   /* Hangileri dogrudur?

        A
        Deneme deneme = new Deneme("f");

        System.out.println(order.str);

        Output af dir

        B
        Deneme deneme = new Deneme();

        System.out.println(order.str);

        Output ab dir

        C
        Compile Time Error verir

        D
        Deneme deneme1 = new Deneme("r");

        Deneme deneme2 = new Deneme();

        System.out.println(deneme1.str + deneme2.str);

        Output arab dir
*/