//Определить нечётное число

package homework_1;
import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ввод пользователем числа для определения четности
        System.out.print("Введите число: ");
        int num = in.nextInt();

        if (num % 2 == 1) { //вычисление остатка от деления числа на 2
            System.out.print("Число " + num + " нечётное"); //печать результата
        }
        else {
            System.out.print("Число " + num + " чётное"); //печать результата
        }
    }
}
