//Проверка делимости одного числа на другое

package home_work_1;
import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ввод пользователем чисел
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        //условие, проверяющее делимость первого числа на второе при условии, что первое больше второго
        if (num1 > num2 && num1 % num2 == 0 || num1 == num2) {
            System.out.print("Число " + num1 + " делится на " + num2 + " без остатка"); //печать результата
        }
        //условие, проверяющее делимость второго числа на первое при условии, что второе больше первого
        else if (num1 < num2 && num2 % num1 == 0) {
            System.out.print("Число " + num2 + " делится на " + num1 + " без остатка"); //печать результата
        }
        //условие, проверяющее НЕделимость первого числа на второе при условии, что первое больше второго
        else if (num1 > num2 && num1 % num2 != 0) {
            System.out.print("Число " + num1 + " не делится на " + num2 + " без остатка"); //печать результата
        }
        //оставшееся условие, проверяющее НЕделимость второго числа на первое при условии, что второе больше первого
        else {
            System.out.print("Число " + num2 + " не делится на " + num1 + " без остатка"); //печать результата
        }
    }
}