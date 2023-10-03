/*Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести
ход вычислений в консоль. Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение
о том что пользователь ввёл некорректные данные.
1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число*/

package home_work_2.loops;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        String number_string = in.nextLine();
        int number = Integer.parseInt(number_string);

        for (int i = 1; i <= number_string.length(); i++) {
            //int digit = Math.floor(number / (Math.pow(10, number_string.length()-i)));
            //System.out.println(digit + " ");
        }
    }
}
