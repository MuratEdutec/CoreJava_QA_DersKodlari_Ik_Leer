package ders32_inheritanceConstructorCall;

public class DCamry extends BToyota{
    DCamry(String pc){
    super ("Deniz");
        System.out.println("String parametreli Camry constructor");
    }
    DCamry(){

    }
    public static void main(String[] args) {
        // Eger kullanilan argumete uygun bir constructor
        // parent class'da yok ise CTE olur

        DCamry camry2=new DCamry("Celal");

        System.out.println("==========================================");
        DCamry camry1= new DCamry();





    }
}
