package com.company;

import java.util.Scanner;

public class FirstHW {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String digits = scanner.next();
        char[] arr = digits.toCharArray();
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.printf("%s", arr[i]);
        }

    }


}
/*
    Нарисовать блок-схему и написать по ней код программы. Алгоритм должен
    переворачивать число, введенное пользователем и распечатать его в перевернутом виде.
    Нельзя использовать готовые функции или переводить число в строку.
    Например, введено 3425, надо вывести 5243.
 */