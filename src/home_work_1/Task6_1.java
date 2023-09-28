//Написать в отдельном классе main метод и в нём код который будет выполнять общее условие при помощи if else

package home_work_1;
import java.util.Scanner;
import java.util.Objects;

public class Task6_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ввод пользователем имени
        System.out.print("Введите свое имя: ");
        String name = in.nextLine();
        String vasya = "Вася";
        String anastasia = "Анастасия";

        //проверка, является ли введенное имя Васей или Анастасией
        if (Objects.equals(name, vasya) || Objects.equals(name, anastasia)) {
            //если введенное имя - Вася, выводится дополнительная строка
            if (Objects.equals(name, vasya)) {
                System.out.println("Привет!");
            }
            System.out.println("Я тебя так долго ждал");
        }
        //все остальные введенные варианты
        else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
