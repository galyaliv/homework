//Проверка делимости одного числа на другое

package home_work_1;
import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        boolean isDivisible = isDivisible(num1, num2);

        if (isDivisible){
            System.out.print("Число " + num1 + " и " + num2 + " делятся друг на друга без остатка");
        }
        else{
            System.out.print("Число " + num1 + " и " + num2 + " НЕ делятся друг на друга без остатка");
        }

//        if (num1 > num2 && num1 % num2 == 0 || num1 == num2) {
//            System.out.print("Число " + num1 + " делится на " + num2 + " без остатка"); //печать результата
//        }
//        else if (num1 < num2 && num2 % num1 == 0) {
//            System.out.print("Число " + num2 + " делится на " + num1 + " без остатка"); //печать результата
//        }
//        else if (num1 > num2 && num1 % num2 != 0) {
//            System.out.print("Число " + num1 + " не делится на " + num2 + " без остатка"); //печать результата
//        }
//        else {
//            System.out.print("Число " + num2 + " не делится на " + num1 + " без остатка"); //печать результата
//        }
    }

    public static boolean isDivisible(int num1, int num2){
        if (num1 > num2 && num1 % num2 == 0 || num1 == num2) {
            return true;
        }
        else if (num1 < num2 && num2 % num1 == 0) {
            return true;
        }
        else if (num1 > num2 && num1 % num2 != 0) {
            return false;
        }
        else {
            return false;
        }
    }
}