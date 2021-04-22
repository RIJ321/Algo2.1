package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] data = {
                {"БИШКЕК", "8:170.0;10:500.0;30:800.0;50:3495.0->1.0:-1.0"},
                {"ОШ", "8.0:350.0;10.0:900.0;30.0:2460.0;50.0:4926.0->1.0:-1.0"},
                {"АЛМАТЫ", "0.3:650.0;0.5:750.0->1.0:430.0"},
                {"ШЫМКЕНТ", "0.3:700.0;0.5:750.0->1.0:430.0"},
                {"МОСКВА", "0.5:1130.14->1.0:160.0"},
                {"САНКТ-ПЕТЕРБУРГ", "0.5:856.98->1.0:231.53"},
                {"ЛОНДОН", "0.5:2900.0->1.0:500.0"},
                {"МАДРИД", "0.5:3000.0->1.0:700.0"},
        };
        boolean a = true;

        while (a) {
            System.out.println("Введите вес груза: ");
            float weight = scanner.nextFloat();
            if (weight <= 0 && a) {
                System.out.println("Введите правильный вес");
            } else if (weight > 0 && a) {
                System.out.println("Доступные города:");
                for (int i = 0; i < data.length; i++) {
                    System.out.println(i + ". " + data[i][0]);
                }
                System.out.println("Введите индекс города из списка:");
                boolean whileTrue = true;
                while (whileTrue) {
                    int citi_Id = scanner.nextInt();
                    if (citi_Id < 0 || citi_Id >= data.length && whileTrue) {
                        System.out.println("Введите индекс города из списка:");
                    } else if (citi_Id < data.length && citi_Id >= 0) {
                        whileTrue = false;
                        String[] temp = data[citi_Id][1].split("->1.0:");
                        float priceForEachKG = Float.parseFloat(temp[1]);
                        temp = temp[0].split(";");
                        for (int i = 0; i < temp.length; i++) {
                            String[] intervals = temp[i].split(":");
                            float intervalWeight = Float.parseFloat(intervals[0]);
                            float priceInterval = Float.parseFloat(intervals[1]);

                            if (weight <= intervalWeight) {
                                System.out.println("Price = " + priceInterval);
                                break;
                            } else if (i == temp.length - 1) {
                                float price = (weight - intervalWeight) * priceForEachKG + priceInterval;
                                System.out.println("Price: " + price);
                            }
                        }
                    }
                }
            }
            if (a) {
                System.out.println("" +
                        "Хотите оформить ещё заказ?\n" +
                        "1. Да \n" +
                        "2. Нет");
                int f = scanner.nextInt();
                if (f == 2) {
                    a = false;
                    System.out.println("Спасибо за заказ.");

                } else if (f == 1) a = true;
                else if (f > 2 && f <= 0) {
                    System.out.println("Убедитесь в правильности набора");
                    a = true;
                }
            }
        }
    }
}
