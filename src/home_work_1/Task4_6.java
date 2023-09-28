//Определить високосный год или нет

package home_work_1;
import java.util.Scanner;

public class Task4_6 {
    public static void main(String[] args) {
        //ввод значения пользователем
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год для проверки: ");
        int year = in.nextInt();

        //проверка на високосность: делится на 4; в случае, если кратно 100, должно быть кратно 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.print("Год " + year + " - високосный");
        }
        else {
            System.out.println("Год " + year + " - не високосный");
        }
    }
}
