package com.gabdev.dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class FactorialTopDown {
    private static Map<Integer, Long> map = new HashMap<>();

    public static long fatorialTopDown(int n) {
        if (n <= 1) return 1;

        if (!map.containsKey(n)) {
            map.put(n, n * fatorialTopDown(n - 1));
        }

        return map.get(n);
    }

    public static void main(String[] args) {
        int n = 7;
        int n1 = 3;
        int n2 = 7;

        System.out.println("Factorial of " + n + " is: " + fatorialTopDown(n));
        System.out.println("Factorial of " + n1 + " is: " + fatorialTopDown(n1));
        System.out.println("Factorial of " + n2 + " is: " + fatorialTopDown(n2));
    }
}
