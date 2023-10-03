/*Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
1.1.1. Используя только цикл*/

package home_work_2.loops;

import java.util.Scanner;

public class Task1_1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число от 1 до 20: ");
        int number = in.nextInt();
        long result = 1;

        if (number >= 1) {
            for (int i=1; i <= number; i++) {
                result *= i;
            }
            System.out.println("Произведение чисел от 1 до " + number + " равно " + result);
        }
        else {
            System.out.println("Некорректные данные");
        }
    }
}
