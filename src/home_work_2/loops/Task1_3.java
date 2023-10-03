/* 1.3. Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число,
которое мы будем возводить, Второе число это степень в которую возводят первое число. Степень - только
положительная и целая. Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25*/

package home_work_2.loops;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите основание: ");
        double number = in.nextInt();
        System.out.print("Введите показатель степени (целый положительный): ");
        int degree = in.nextInt();
        double result = 1;

        for (; degree > 0; degree--) {
            result *= number;
        }
        System.out.print(number + " в степени " + degree + " = " + result);
    }
}
