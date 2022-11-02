package ders13_nestedForLoop_methodolusturma;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        // 1-4 arasindaki  sayilar icin carpim tablosu olusturalim

            // dis dongu satirlari kontrol eder
            // ic  dongu kolanlari kontrol eder

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 4; j++) {
                System.out.print(i * j + " ");
            }

            //ic dongu bittiginde java'yi alt satira indirmeliyiz

            System.out.println("");
        }
    }
}

