//Определить нечётное число

package home_work_1;
import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        boolean isEven = isEven(num);
        if (isEven){
            System.out.println("Число " + num + " чётное");
        }
        else {
            System.out.print("Число " + num + " нечётное");
        }
    }

    public static boolean isEven(int num){
        if (num % 2 == 1) { //вычисление остатка от деления числа на 2
            return false;
        }
        else {
            return true;
        }
    }
}
