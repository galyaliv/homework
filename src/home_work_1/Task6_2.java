//Написать в отдельном классе main метод и в нём код который будет выполнять общее условие при помощи if else if

package home_work_1;
import java.util.Objects;
import java.util.Scanner;

public class Task6_2 implements ICommunicationPrinter {
    @Override
    public String welcome(String name){
        if (Objects.equals(name, "Вася")) {
            return "Привет!\nЯ тебя так долго ждал";
        }
        else if (Objects.equals(name, "Анастасия")) {
            return "Я тебя так долго ждал";
        }
        else {
            return "Добрый день, а вы кто?";
        }
    }
}