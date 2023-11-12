//Определить високосный год или нет

package home_work_1;
import java.util.Scanner;

public class Task4_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год для проверки: ");
        int year = in.nextInt();
        boolean isLeap = isLeap(year);

        if (isLeap){
            System.out.print("Год " + year + " - високосный");
        }
        else{
            System.out.println("Год " + year + " - не високосный");
        }
    }

    public static boolean isLeap(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}