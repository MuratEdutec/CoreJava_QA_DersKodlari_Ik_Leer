package ders28_varargsstringBuilder;

public class C06_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Java Guzeldir");
        System.out.println(sb.indexOf("a")); // 1
        System.out.println(sb.indexOf("a", 2)); // 3
    }
}