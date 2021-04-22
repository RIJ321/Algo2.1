package com.company;

import java.util.Random;
import java.util.Scanner;

public class ThirdHW {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Начальный диапазон:");
        int a = scan.nextInt(); //this is whatever value you're going up to.
        System.out.println("Конечный диапазон:");
        int b = scan.nextInt();


        for (int i = a; i < b; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " " );
            }
        }


    }

}
/*
     Напишите программу для нахождения натуральных чисел в заданном диапазоне.
     Пример
     Введите начальный диапазон: 1
     Введите конечный диапазон: 50
     Результат:
     Натуральные числа между 1 и 50:
     2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
 */