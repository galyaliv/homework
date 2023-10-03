package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    /* метод создает массив, считывая ввод с консоли
     * возвращает массив, созданный на основе ввода пользователя.*/
    public static int[] arrayFromConsole(){
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива: ");

        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i+1) + ": ");
            array[i] = in.nextInt();
        }
        return array;
    }

    /* Создает массив случайных чисел.
     * Метод получает размер массива size и верхнюю границу (исключая) для случайных чисел maxValueExclusion
     * Метод возвращает массив случайных чисел.
     */
    public static int[] arrayRandom(int size, int maxValueExclusion){
        Random rnd = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(maxValueExclusion);
        }
        return array;
    }
}
