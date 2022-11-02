package ders11_stringManipulation;

public class C04_replaceAll {
    public static void main(String[] args) {
        //kullanicinin girdigi metinde
        //harf disinda kalan tum karakterleri temizleyen bir kod yazin
        //NOT: space silinmemeli

        String input= "Ja5+va cok 1*guzel";
/*
        input= input.replaceAll("\\W","");//Ja5vacok1guzel
        System.out.println(input);
        input=input.replaceAll("\\d","");//Javacokguzel
        System.out.println(input);

  */
        input=input.replaceAll("\\d","");//Ja+va cok *guzel
        System.out.println(input);
        input= input.replaceAll(" ","5");//Ja+va5cok5*guzel
        System.out.println(input);
        input= input.replaceAll("\\W","");
        System.out.println(input);//Java5cok5guzel

        input= input.replace("5"," ");//Java cok guzel
        System.out.println(input);

        // Yukaridaki kod dinamik KOD DUR/


        String input1= "99Ha==-=-5+va c....ok 1*guz***el";
        input1=input1.replaceAll("\\d","");//Ha==-=-+va c....ok *guz***el
        System.out.println(input1);

        input1= input1.replaceAll(" ","5");//Ha==-=-+va5c....ok5*guz***el
        System.out.println(input1);

        input1= input1.replaceAll("\\W","");//Hava5cok5guzel
        System.out.println(input1);//Java5cok5guzel

        input1= input1.replace("5"," ");//Hava cok guzel
        System.out.println(input1);













    }
}
