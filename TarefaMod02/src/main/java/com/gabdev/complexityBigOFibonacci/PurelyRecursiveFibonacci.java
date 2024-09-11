package com.gabdev.complexityBigOFibonacci;

public class PurelyRecursiveFibonacci {
    public static int findElement(int e) {
        if (e <= 1) return e;
        return findElement(e - 1) + findElement(e - 2);
    }

    public static void main(String[] args) {
        System.out.println(findElement(7));
    }
}
