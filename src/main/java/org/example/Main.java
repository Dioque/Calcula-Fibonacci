package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculaFibonacci calculaFibonacci = new CalculaFibonacci();

        System.out.println("Informado um número para calcula a sequência de Fibonacci!");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println(calculaFibonacci.calculaFibonacci(i));
        }
    }


}