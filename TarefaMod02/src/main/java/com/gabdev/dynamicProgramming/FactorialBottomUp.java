package com.gabdev.dynamicProgramming;

public class FactorialBottomUp {
    public static long fatorialBottomUp(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 1;

        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1] * i;
        }

        return arr[n];
    }

    public static void main(String[] args) {
        int n = 7;

        System.out.println("Factorial of " + n + " is: " + fatorialBottomUp(n));
    }
}
