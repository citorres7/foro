package com.exercise.university.foro.service;

import java.util.Scanner;

public class CalculateNumMin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 5 números enteros separados por espacios:");

        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
        }

        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El menor de los números es: " + menor);
        scanner.close();
    }
}
