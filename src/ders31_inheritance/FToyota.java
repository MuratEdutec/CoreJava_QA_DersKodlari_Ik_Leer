package ders31_inheritance;

public class FToyota extends EAraba{

    FToyota(){
        super();
        System.out.println("Toyota cons. calisti");
    }

    protected String marka="Toyota";
    protected String motor="Toyota araclar cevreci motor kullanir";
    protected String uretimYeri="Urutim yeri belirtilmemis";
    protected int hiz=140;


}
