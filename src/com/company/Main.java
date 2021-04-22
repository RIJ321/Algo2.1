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

        System.out.println("Введите вес груза: ");
        float weight = scanner.nextFloat();

        System.out.println("Доступные города:");
        for (int i = 0; i < data.length; i++) {
            System.out.println(i + ". " + data[i][0]);
        }

        boolean whileTrue = true;
        while (whileTrue) {

            System.out.println("Введите индекс города из списка:");

            int citi_Id = scanner.nextInt();


            if (citi_Id < 0 || citi_Id > data.length && whileTrue) {
                System.out.println("Введите индекс города из списка:");
            } else if (citi_Id < data.length && citi_Id >= 0) {
                whileTrue = false;

                String[] temp = data[citi_Id][1].split("->1.0:");

                float priceForEachKG = Float.parseFloat(temp[1]);

                temp = temp[0].split(";");

                for (int i = 0; i < temp.length; i++) {

                    String[] priceInterval = temp[i].split(":");

                    float price = Float.parseFloat(priceInterval[1]);
                    float intervalWeight = Float.parseFloat(priceInterval[0]);
                    if (weight <= intervalWeight) {
                        System.out.println("Price = " + priceInterval);
                        break;
                    }
                    else if (i == temp.length - 1) {
                        float prices = ((weight - intervalWeight) * priceForEachKG + price);
                        if (price <= 0) {
                            System.out.println("Price can not be calculated");
                        } else {
                            System.out.println("Price: " + prices);
                        }
                    }


                }
            }

        }

               /* String[] weightInterval = temp[0].split(":");
                String[] priceInterval = temp[1].split(":");
                System.out.println(Arrays.toString(weightInterval));*/
    }


}
