package home_work_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task6_1Test {
    private ICommunicationPrinter task6_1 = new Task6_1();

    @Test
    @DisplayName("Тестирование приветствия с Васей")
    public void welcome1(){
        String result = task6_1.welcome("Вася");
        assertEquals("Привет!\nЯ тебя так долго ждал", result);
    }
    @Test
    @DisplayName("Тестирование приветствия с Анастасией")
    public void welcome2(){
        String result = task6_1.welcome("Анастасия");
        assertEquals("Я тебя так долго ждал", result);
    }
    @Test
    @DisplayName("Тестирование приветствия с другим именем")
    public void welcome3(){
        String result = task6_1.welcome("Галя");
        assertEquals("Добрый день, а вы кто?", result);
    }
}
