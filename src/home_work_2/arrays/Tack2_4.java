package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Scanner;

public class Tack2_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //2.4.1. Сумма четных положительных элементов массива
        int[] array1 = ArraysUtils.arrayRandom(50, 100);
        for (int element : array1) {
            System.out.print(element + " ");
        }
        System.out.println();
        int sum1 = task1(array1);
        System.out.println("Сумма четных положительных элементов массива равна " + sum1);
        System.out.println();

        //2.4.2. Максимальный из элементов массива с четными индексами
        int[] array2 = ArraysUtils.arrayRandom(50, 100);
        for (int element : array2) {
            System.out.print(element + " ");
        }
        System.out.println();
        int max = task2(array2);
        System.out.println("Максимальный из элементов массива с четными индексами: " + max);
        System.out.println();

        //2.4.3. Элементы массива, которые меньше среднего арифметического
        int[] array3 = ArraysUtils.arrayRandom(50, 100);
        for (int element : array3) {
            System.out.print(element + " ");
        }
        System.out.println();
        String result3 = task3(array3);
        System.out.println("Элементы массива, которые меньше среднего арифметического:" + result3);
        System.out.println();

        //2.4.4. Найти два наименьших (минимальных) элемента массива
        int[] array4 = ArraysUtils.arrayRandom(50, 100);
        for (int element : array4) {
            System.out.print(element + " ");
        }
        System.out.println();
        int[] min = task4(array4);
        System.out.println("Два наименьших элемента массива: " + min[0] + " и " + min[1]);
        System.out.println();

        //2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
        int[] array5 = ArraysUtils.arrayRandom(50, 100);
        System.out.print("Введите нижнюю границу интервала: ");
        int bottom = in.nextInt();
        System.out.print("Введите верхнюю границу интервала: ");
        int top = in.nextInt();
        for (int element : array5) {
            System.out.print(element + " ");
        }
        System.out.println();
        int[] result5 = task5(array5, bottom, top);
        for (int element : result5) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println();

        //2.4.6. Сумма цифр массива
        int[] array6 = ArraysUtils.arrayRandom(50, 100);
        //int[] array6 = {12, 104, 81};
        for (int element : array6) {
            System.out.print(element + " ");
        }
        System.out.println();
        int sum6 = task6(array6);
        System.out.print("Сумма цифр массива равна " + sum6);
    }

    /* Метод вычисляет сумму четных положительных элементов массива.
     * @param array Массив целых чисел.
     * @return Сумма четных положительных элементов массива.
     * */
    public static int task1(int[] array) {
        int sum = 0;
        for (int element : array) {
            if (element > 0 && element % 2 == 0) {
                sum += element;
            }
        }
        return sum;
    }

    /* Метод находит максимальный элемент массива с четными индексами.
     * @param array Массив целых чисел.
     * @return Максимальный элемент массива с четными индексами.
     * */
    public static int task2(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i+=2) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /* Метод возвращает строку, содержащую элементы массива, которые меньше среднего арифметического
     * @param array Массив целых чисел.
     * @return Строка с элементами массива, меньшими среднего арифметического.
     * */
    public static String task3(int[] array){
        double sum = 0;
        double average;
        String result = "";

        for (int element : array) {
            sum += element;
        }
        average = sum / array.length;

        for (int element : array) {
            if (element < average) {
                result += element + " ";
            }
        }
        return result;
    }

    /* Метод находит два наименьших элемента массива.
     * @param array Массив целых чисел.
     * @return Массив с двумя наименьшими элементами.
     * */
    public static int[] task4(int[] array){
        int[] min = {array[0], array[0]};
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min[0] && array[i] <= min[1]) {
                min[1] = min[0];
                min[0] = array[i];
            }
            else if (array[i] > min[0] && array[i] < min[1]) {
                min[1] = array[i];
            }
        }
        return min;
    }

    /**
     * Заменяет все элементы массива, находящиеся в диапазоне от bottom до top, на ноль.
     * Затем перемещает все нулевые элементы в начало массива и заполняет остальные элементы нулями.
     *
     * @param array  Массив целых чисел.
     * @param bottom Нижняя граница диапазона.
     * @param top    Верхняя граница диапазона.
     * @return Измененный массив.
     */

    /* Метод заменяет все элементы массива, находящиеся в диапазоне от bottom до top, на ноль.
     * Затем перемещает все нулевые элементы в начало массива и заполняет остальные элементы нулями.
     * @param array  Массив целых чисел.
     * @param bottom Нижняя граница диапазона.
     * @param top    Верхняя граница диапазона.
     * @return Измененный массив.
     * */
    public static int[] task5(int[] array, int bottom, int top){
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= bottom && array[i] <= top) {
                array[i] = 0;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                for (int j = i+1; j < array.length; j++) {
                    if (array[j] != 0){
                        array[i] = array[j];
                        array[j] = 0;
                        break;
                    }
                }
            }
        }
        array[array.length-1] = 0;
        return array;
    }

    /* Метод вычисляет сумму всех цифр в каждом элементе массива.
     * @param array Массив целых чисел.
     * @return Сумма всех цифр в массиве.
     * */
    public static int task6(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            while (array[i] != 0) {
                sum += array[i] % 10;
                array[i] = (array[i] - array[i] % 10) / 10;
            }
        }
        return sum;
    }
}