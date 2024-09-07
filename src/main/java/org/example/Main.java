package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FibonacciChecker fibonacciChecker = new FibonacciChecker();

        System.out.println("Digite um número para verificar se pertence à sequência de Fibonacci:");
        int numero = scanner.nextInt();

        if(fibonacciChecker.calculaFibonacci(numero)){
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        }else{
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}