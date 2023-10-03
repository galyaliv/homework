package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Scanner;

public class ArraysIteration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = ArraysUtils.arrayFromConsole();
        printArray(array);
        printSecondElement(array);
        printBackward(array);
    }

    /*2.2.1. Вывести все элементы в консоль
    * Метод получает массив и распечатывает его 4 способами
    * */
    public static void printArray(int[] array) {
        int i = 0;
        do {
            System.out.print(array[i] + " ");
            i++;
        }
        while (i < array.length);
        System.out.println();

        i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();

        i = 0;
        for (; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /*2.2.2. Вывести каждый второй элемент массива в консоль
    * Метод получает массив и распечатывает его каждый второй элемент 4 способами
    * */
    public static void printSecondElement(int[] array) {
        int i = 1;
        do {
            System.out.print(array[i] + " ");
            i += 2;
        }
        while (i < array.length);
        System.out.println();

        i = 1;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i += 2;
        }
        System.out.println();

        i = 1;
        for (; i < array.length; i+=2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int element : array) {
            if (count % 2 == 1) {
                System.out.print(element + " ");
            }
            count++;
        }
        System.out.println();
    }

    /*2.2.3. Вывести все элементы массива в консоль в обратном порядке.
    * Метод получает массив и распечатывает его в обратном порядке 4 способами
    * */
    public static void printBackward(int[] array) {
        int i = 0;
        do {
            System.out.print(array[array.length-1 - i] + " ");
            i++;
        }
        while (i < array.length);
        System.out.println();

        i = 0;
        while (i < array.length) {
            System.out.print(array[array.length-1 - i] + " ");
            i++;
        }
        System.out.println();

        i = 0;
        for (; i < array.length; i++) {
            System.out.print(array[array.length-1 - i] + " ");
        }
        System.out.println();

        int count = 1;
        int[] newArray = new int[array.length];
        for (int element1 : array) {
            newArray[array.length-count] = element1;
            count++;
        }
        for (int element2 : newArray) {
            System.out.print(element2 + " ");
        }
        System.out.println();
    }
}
