package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //2.1.1.
        int[] container1 = ArraysUtils.arrayFromConsole();
        System.out.println("Созданный массив: " + Arrays.toString(container1));

        //2.1.2.
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        System.out.print("Введите границу массива: ");
        int maxValueExclusion = in.nextInt();
        int[] container2 = ArraysUtils.arrayRandom(size, maxValueExclusion);
        for (int element : container2) {
            System.out.print(element + " ");
        }
    }
}
