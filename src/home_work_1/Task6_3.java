//Написать в отдельном классе main метод и в нём код который будет выполнять общее условие при помощи switch

package home_work_1;
import java.util.Objects;
import java.util.Scanner;

public class Task6_3 implements ICommunicationPrinter {
    @Override
    public String welcome(String name){
        switch (name) {
            case "Вася":
                return "Привет!\nЯ тебя так долго ждал";
            case "Анастасия":
                return "Я тебя так долго ждал";
            default:
                return "Добрый день, а вы кто?";
        }
    }
}
