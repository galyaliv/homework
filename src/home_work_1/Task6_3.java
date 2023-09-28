//Написать в отдельном классе main метод и в нём код который будет выполнять общее условие при помощи switch

package home_work_1;
import java.util.Objects;
import java.util.Scanner;

public class Task6_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ввод пользователем имени
        System.out.print("Введите свое имя: ");
        String name = in.nextLine();

        switch (name) {
            case "Вася":
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
                break;
        }
    }
}
