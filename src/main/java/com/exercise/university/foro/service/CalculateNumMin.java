package com.exercise.university.foro.service;

import java.util.Scanner;

public class CalculateNumMin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 whole numbers separated by spaces:");

        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        int minor = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minor) {
                minor = numbers[i];
            }
        }

        System.out.println("The smallest number is: " + minor);
        scanner.close();
    }
}
