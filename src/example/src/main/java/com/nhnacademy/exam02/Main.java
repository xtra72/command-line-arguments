package com.nhnacademy.exam02;

public class Main {
    public static void main(String[] args) {
        for (String arg : args) {
            try {
                int value = Integer.parseInt(arg);
                System.out.println("int : " + value);
            } catch (NumberFormatException ignore) {
                System.out.println("String : " + arg);
            }
        }
    }
}
