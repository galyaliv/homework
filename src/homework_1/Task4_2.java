//Среди трёх чисел найти среднее

package homework_1;
import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ввод пользователем чисел
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = in.nextInt();

        if ((num1 >= num2 && num1 <= num3) || (num1 >= num3 && num1 <= num2)) { //проверка первого числа
            System.out.print("Среднее среди чисел: " + num1); //печать результата
        }
        else if ((num2 >= num1 && num2 <= num3) || (num2 >= num3 && num2 <= num1)) { //проверка второго числа
            System.out.print("Среднее среди чисел: " + num2); //печать результата
        }
        else {
            System.out.print("Среднее среди чисел: " + num3); //печать результата
        }
    }
}
