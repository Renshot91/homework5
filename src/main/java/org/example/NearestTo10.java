package org.example;

import java.util.Scanner;
//Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
//        Числа могут быть, как целочисленные, так и дробные.
//        Например :
//        ввод : m=10.5, n=10.45
//        вывод: Число 10.45 ближе к 10.
public class NearestTo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение для переменной m: ");
        double m = scanner.nextDouble();

        System.out.print("Введите значение для переменной n: ");
        double n = scanner.nextDouble();

        double distanceTo10M = Math.abs(10 - m);
        double distanceTo10N = Math.abs(10 - n);

        if (distanceTo10M < distanceTo10N) {
            System.out.println("Число " + m + " ближе к 10.");
        } else if (distanceTo10M > distanceTo10N) {
            System.out.println("Число " + n + " ближе к 10.");
        } else {
            System.out.println("Числа равноудалены от 10.");
        }
    }
}
