package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println(factorial(-1));
    }
        public static int factorial(int n) {
            int rez = 1;
            if(n<0){
                System.out.println("Невозможно посчитать факториал отрицательного числа");
                return -1;
            }
            for (int i = 1; i <= n; i++) {
                rez *= i;
            }
            return rez;
    }
}
