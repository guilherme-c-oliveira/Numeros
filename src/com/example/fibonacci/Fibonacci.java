package com.example.fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int primNumero = 1;
        int seguNumero = 1;
        int proxNumero;
        System.out.println("**********************************************");
        System.out.println("Calcula serie de fibonacci primeiros 20 termos");

            System.out.println(primNumero);
            System.out.println(seguNumero);
        for (int i = 0; i < 50; i++) {
            proxNumero = primNumero + seguNumero;
            System.out.println(proxNumero);
            primNumero = seguNumero;
            seguNumero = proxNumero;
        }
    }
}
