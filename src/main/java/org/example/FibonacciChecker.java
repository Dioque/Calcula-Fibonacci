package org.example;

public class CalculaFibonacci {
    public int calculaFibonacci(int n){
        if (n <= 1){
            return n;
        }
        return calculaFibonacci(n - 1) + calculaFibonacci(n - 2);
    }


}
