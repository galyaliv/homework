package home_work_2.loops;

import java.util.Scanner;
import java.util.Random;

public class Task1_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //1.5.1 Найти наибольшую цифру натурального числа
        System.out.print("1.5.1 Введите число: ");
        String number1_string = in.nextLine();
        int maxDigit = maxDigit(number1_string);
        System.out.println("Наибольшая цифра числа " + number1_string + " = " + maxDigit);

        //1.5.2 Вероятность четных случайных чисел
        double probability = calculateProbability();
        System.out.println("1.5.2 Вероятность выпадения четного числа равна " + probability);

        //1.5.3. Посчитать четные и нечетные цифры числа
        System.out.print("1.5.3 Введите число: ");
        String number3_string = in.nextLine();
        int even = countEven(number3_string);
        System.out.println("В числе " + number3_string + " четных " + even + " и нечетных " + (number3_string.length()-even) + " цифр");

        //1.5.4. Ряд Фибоначчи
        System.out.print("1.5.4 Введите количество элементов ряда: ");
        int number4 = in.nextInt();
        int[] array4 = fibonacci(number4);
        for (int element : array4) {
            System.out.print(element + " ");
        }

        //1.5.5. Вывести ряд чисел в диапазоне с шагом
        System.out.println();
        System.out.print("1.5.5 Введите наименьшее число диапазона: ");
        int min5 = in.nextInt();
        System.out.print("Введите наибольшее число диапазона: ");
        int max5 = in.nextInt();
        System.out.print("Введите шаг: ");
        int step = in.nextInt();
        printSequence(min5, max5, step);

        //1.5.6. Переворот числа
        System.out.println();
        System.out.print("1.5.6 Введите число: ");
        int number6 = in.nextInt();
        int reversedNumber = reverseNumber(number6);
        System.out.print("Перевернутое число: " + reversedNumber);
    }

    /* 1.5.6. Переворот числа
     * метод получает число, цикл определяет последнюю цифру числа, отделяет ее от него и ставит в начало
     * перевернутого числа
     * метод возвращает перевернутое число
     * */
    public static int reverseNumber(int number6) {
        int reversedNumber = 0;
        int digit;
        while (number6 != 0) {
            digit = number6 % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number6 /= 10;
        }
        return reversedNumber;
    }

    /* 1.5.5. Вывести ряд чисел в диапазоне с шагом
     * метод получает минимальное, максимальное значения и шаг, цикл перебирает числа
     * от минимального до максимального значения с соответствующим шагом и печатает их
     * */
    public static void printSequence(int min5, int max5, int step) {
        for (int i = min5; i <= max5; i+=step) {
            System.out.print(i + " ");
        }
    }

    /* 1.5.4. Ряд Фибоначчи
     * метод получает количество элементов ряда, цикл заполняет массив, где первые 2 элемента - единицы,
     * все последующие - сумма двух предыдущих
     * метод возвращает массив
     * */
    public static int[] fibonacci(int number4){
        int[] array4 = new int[number4];
        for (int i = 0; i < number4; i++) {
            if (i==0 || i==1) {
                array4[i] = 1;
            }
            else {
                array4[i] = array4[i-1] + array4[i-2];
            }
        }
        return array4;
    }

    /*1.5.3. Посчитать четные и нечетные цифры числа
    * метод принимает строку, превращает ее в число, цикл проверяет на четность и уменьшает число на последнюю цифру
    * метод возвращает количество четных цифр
    * */
    public static int countEven(String number3_string){
        int number3 = Integer.parseInt(number3_string);
        int even = 0;
        for (int i = 0; i < number3_string.length(); i++) {
            if (number3 % 2 == 0) {
                even += 1;
            }
            number3 = (number3 - number3 % 10) / 10;
        }
        return even;
    }

    /*1.5.2 Вероятность четных случайных чисел
    * метод содержит цикл, который получает случайное число, определяет его четность и считает четные (even) из них
    * метод возвращает вероятность, рассчитанную как число четных чисел, деленное на количество чисел всего */
    public static double calculateProbability(){
        Random rnd = new Random();
        int number2;
        double even = 0;
        double probability;
        int counter = 0;
        for (; counter < 100000; ++counter) {
            number2 = rnd.nextInt();
            if (number2 % 2 == 0) {
                even += 1;
            }
        }
        probability = even / counter;
        return probability;
    }

    /*1.5.1 Найти наибольшую цифру натурального числа
    * метод maxDigit получает введенное пользователем число в виде строки, превращает в число
    * цикл сравнивает с предыдущим максимальным значением последнюю цифру числа и присваивает ему новое значение, если последняя цифра оказалась больше
    * далее цикл сокращает число на последнюю цифру для последующей проверки
    * метод возвращает полученное максимальное значение */
    public static int maxDigit(String number1_string){
        int number1 = Integer.parseInt(number1_string);
        int max = 0;
        for (int i = 0; i < number1_string.length(); i++) {
            if (number1 % 10 > max) {
                max = number1 % 10;
            }
            number1 = (number1 - number1 % 10) / 10;
        }
        return max;
    }
}