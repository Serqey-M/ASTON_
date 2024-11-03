package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println(factorial(-5));
    }
        public static int factorial(int n) {
            int rez = 1;
            for (int i = 1; i <= n; i++) {
                rez *= i;
            }
            return rez;
    }
}
