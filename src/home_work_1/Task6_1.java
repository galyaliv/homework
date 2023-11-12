//Написать в отдельном классе main метод и в нём код который будет выполнять общее условие при помощи if else

package home_work_1;
import java.util.Objects;

public class Task6_1 implements ICommunicationPrinter {
    @Override
    public String welcome(String name){
        if (Objects.equals(name, "Вася") || Objects.equals(name, "Анастасия")) {
            if (Objects.equals(name, "Вася")) {
                return "Привет!\nЯ тебя так долго ждал";
            }
            return "Я тебя так долго ждал";
        }
        else {
            return "Добрый день, а вы кто?";
        }
    }
}