package ders36_checkedExceptions;

import java.io.FileInputStream;

public class C01_IOExceptions {

    public static void main(String[] args) {
        FileInputStream fis=new FileInputStream("src/ders36_checkedExceptions/Deneme.txt");
        // Java ile bilgisayaraimizdaki bir dosyaya ulasmak istersek
        // FileInputStream class'indan obje olusturup
        // o obje araciligiyla dosyayi kullanabiliriz

        // fis olustururken ulasmak istedigimiz dosyanin
        // dosya yolunu parametre olarak girmeliyiz

    }
}
