package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

import java.util.Arrays;

public class SortsMain {
    public static void main(String[] args) {
        //4.2.1 Проверка предварительно заданных массивов
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] array2 = new int[]{1, 1, 1, 1};
        int[] array3 = new int[]{9, 1, 5, 99, 9, 9};
        int[] array4 = new int[]{};
        int[] array5 = new int[]{6, 5, 4, 3, 2, 1};

        System.out.println("Сортировка предварительно созданных массивов пузырьковым способом:");
        System.out.println("Массив 1 до сортировки: " + Arrays.toString(array1));
        SortsUtils.sort(array1);
        System.out.println("Массив 1 после сортировки: " + Arrays.toString(array1));

        System.out.println("Массив 2 до сортировки: " + Arrays.toString(array2));
        SortsUtils.sort(array2);
        System.out.println("Массив 2 после сортировки: " + Arrays.toString(array2));

        System.out.println("Массив 3 до сортировки: " + Arrays.toString(array3));
        SortsUtils.sort(array3);
        System.out.println("Массив 3 после сортировки: " + Arrays.toString(array3));

        System.out.println("Массив 4 до сортировки: " + Arrays.toString(array4));
        SortsUtils.sort(array4);
        System.out.println("Массив 4 после сортировки: " + Arrays.toString(array4));

        System.out.println("Массив 5 до сортировки: " + Arrays.toString(array5));
        SortsUtils.sort(array5);
        System.out.println("Массив 5 после сортировки: " + Arrays.toString(array5));

        array1 = new int[]{1, 2, 3, 4, 5, 6};
        array2 = new int[]{1, 1, 1, 1};
        array3 = new int[]{9, 1, 5, 99, 9, 9};
        array4 = new int[]{};
        array5 = new int[]{6, 5, 4, 3, 2, 1};
        System.out.println("Сортировка предварительно созданных массивов шейкерным способом:");
        System.out.println("Массив 1 до сортировки: " + Arrays.toString(array1));
        SortsUtils.shake(array1);
        System.out.println("Массив 1 после сортировки: " + Arrays.toString(array1));

        System.out.println("Массив 2 до сортировки: " + Arrays.toString(array2));
        SortsUtils.shake(array2);
        System.out.println("Массив 2 после сортировки: " + Arrays.toString(array2));

        System.out.println("Массив 3 до сортировки: " + Arrays.toString(array3));
        SortsUtils.shake(array3);
        System.out.println("Массив 3 после сортировки: " + Arrays.toString(array3));

        System.out.println("Массив 4 до сортировки: " + Arrays.toString(array4));
        SortsUtils.shake(array4);
        System.out.println("Массив 4 после сортировки: " + Arrays.toString(array4));

        System.out.println("Массив 5 до сортировки: " + Arrays.toString(array5));
        SortsUtils.shake(array5);
        System.out.println("Массив 5 после сортировки: " + Arrays.toString(array5));

        //4.2.2 Проверка массива с рандомным заполнением
        int[] array6 = ArraysUtils.arrayRandom(50, 100);
        System.out.println("Массив 6 до сортировки: " + Arrays.toString(array6));
        SortsUtils.sort(array6);
        System.out.println("Массив 6 после сортировки пузырьковым способом: " + Arrays.toString(array6));
        SortsUtils.shake(array6);
        System.out.println("Массив 6 после сортировки шейкерным способом: " + Arrays.toString(array6));

        //4.2.3 Проверка массива, полученного через консоль
        int[] array7 = ArraysUtils.arrayFromConsole();
        System.out.println("Массив 7 до сортировки: " + Arrays.toString(array7));
        SortsUtils.sort(array7);
        System.out.println("Массив 7 после сортировки пузырьковым способом: " + Arrays.toString(array7));
        SortsUtils.shake(array7);
        System.out.println("Массив 7 после сортировки шейкерным способом: " + Arrays.toString(array7));
    }
}
