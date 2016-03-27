package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
       String two = System.getProperty("java.specification.version");
       return Double.parseDouble(two);
    }

    public static void main(String[] args) {
       //System.out.println(getVersion());
    }
}