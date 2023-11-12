//Среди трёх чисел найти среднее

package home_work_1;
import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = in.nextInt();

        int avg = avg(num1, num2, num3);
        System.out.print("Среднее среди чисел: " + avg);
    }

    public static int avg(int num1, int num2, int num3){
        if ((num1 >= num2 && num1 <= num3) || (num1 >= num3 && num1 <= num2)) {
            return num1;
        }
        else if ((num2 >= num1 && num2 <= num3) || (num2 >= num3 && num2 <= num1)) {
            return num2;
        }
        else {
            return num3;
        }
    }
}
