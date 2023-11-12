package home_work_1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сейчас рабочий день? (Да - true, нет - false)");
        boolean answer1 = in.nextBoolean();
        System.out.println("У вас сейчас рабочий день? (Да - true, нет - false)");
        boolean answer2 = in.nextBoolean();

        boolean result = sleepIn(answer1, answer2);

        if (result) {
            System.out.println("Продолжаем спать");
        }
        else {
            System.out.println("Встаем срочно на работу!");
        }
    }

    /**
     * Проверяем можем спать дальше или нет
     * @param weekday признак рабочий день
     * @param vacation признак отпуск
     * @return true - если можно спать, false - если спать нельзя
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
