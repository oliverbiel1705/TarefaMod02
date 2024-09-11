package com.gabdev.factorialByRecursion;

public class FactorialByRecursion {
    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }
}
