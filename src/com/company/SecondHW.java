package com.company;

import java.util.*;

public class SecondHW {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num, reminder, Largest = 0, sec_Largest = 0;
        System.out.println("Enter the Number :");

        num = scanner.nextInt();
        while (num > 0) {
            reminder = num % 10;
            if (Largest < reminder) {
                sec_Largest = Largest;
                Largest = reminder;
            } else if (reminder >= sec_Largest) {
                sec_Largest = reminder;
            }
            num = num / 10;
        }

        System.out.println("The Second Largest Digit is " + sec_Largest);
    }


}
/*
    Нарисовать блок-схему и написать по ней код программы. Алгоритм должен находить
    второе максимальное число в массиве.
    Например, дан массив: 3,2,8,9,1,5,4,3,7,8,5,9,9
    Вывод: 8
 */


/* OptionalInt max = Arrays.stream(asd).max();
        System.out.println(max.getAsInt());*/
/*Arrays.sort(asd,Collections.reverseOrder());
        Integer[] asd = {1, 2, 4, 1, 2, 3, 4};

        for (int i = asd.length-1; i >= 0 ; i++) {

        }
        System.out.println(asd[2]);

        }*/
