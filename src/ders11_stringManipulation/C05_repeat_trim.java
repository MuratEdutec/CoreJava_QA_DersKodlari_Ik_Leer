package ders11_stringManipulation;

public class C05_repeat_trim {
    public static void main(String[] args) {
        String str="Java guzeldir\n";
        System.out.println(str.repeat(4));

        str= "   Java guzeldir   ";

        System.out.println(str.length());
        str=str.trim();
        System.out.println(str+" "+str.length()+" karaktere indi");






    }

}
