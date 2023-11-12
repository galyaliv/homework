/*1. Побитовые операции:
1.1 Создать класс и написать код с вводом двух чисел через консоль и применением побитовых операций И и ИЛИ
к этим двум числам. Результат операций распечатать.
1.2 В комментариях напротив каждого ввода значений написать пример выбранного числа в двоичном коде (8 бит),
также написать комметарии напротив каждой операции на примере этих двух чисел.*/

package home_work_1;
import java.util.Scanner;

public class Task1_1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        System.out.println("Результат операции И: " + and(num1, num2));
        /* 0001 0100
           0000 1010
           0000 0000 - результат 0 */

        System.out.println("Результат операции ИЛИ: " + or(num1, num2)); //печать результата
        /* 0001 0100
           0000 1010
           0001 1110 - результат 30 */
    }

    public static int and(int num1, int num2){
        return num1 & num2;
    }

    public static int or(int num1, int num2){
        return num1 | num2;
    }
}