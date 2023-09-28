//Написать в отдельном классе main метод и в нём код который будет выполнять общее условие при помощи if else if

package home_work_1;
import java.util.Objects;
import java.util.Scanner;

public class Task6_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ввод пользователем имени
        System.out.print("Введите свое имя: ");
        String name = in.nextLine();
        String vasya = "Вася";
        String anastasia = "Анастасия";

        //проверка, является ли введенное имя Васей
        if (Objects.equals(name, vasya)) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        //проверка, является ли введенное имя Анастасией
        else if (Objects.equals(name, anastasia)) {
            System.out.println("Я тебя так долго ждал");
        }
        //все остальные введенные варианты
        else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}