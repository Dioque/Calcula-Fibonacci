package org.example;

public class FibonacciChecker {
    public boolean calculaFibonacci(int n){
        int a = 0, b = 1;

        if (n == 0 || n == 1) {
            return true;
        }

        int c;

        while (b < n){
            c = a + b;
            a = b;
            b = c;
        }

        return b == n;
    }


}
