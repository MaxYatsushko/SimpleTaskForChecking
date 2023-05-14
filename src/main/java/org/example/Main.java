package org.example;

/*Необходимо реализовать следующий метод:

Получаем на входе массив чисел.
Все четные числа увеличиваем на единицу.
Возвращаем кусок списка с 3-го по 7-й элемент.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] arrayInt = new int[12];

        for (int i = 0; i < arrayInt.length; i++)
            arrayInt[i] = i + 3;

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(showList3_7(arrayInt));
    }

    public static List<Integer> showList3_7(int[] arr){
        for (int i = 0; i < arr.length; i++)
            if(arr[i] % 2 == 0)
                arr[i] += 1;
        List<Integer> integerList = new ArrayList<>();
        for (int i = 2; i < 7; i++)
            integerList.add(arr[i]);

        return integerList;
    }
}