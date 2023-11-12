package home_work_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1_1_2Test {
    @Test
    @DisplayName("Тестирование операции И")
    public void and(){
        int result1 = Task1_1_2.and(1, 1);
        assertEquals(1, result1);
        int result2 = Task1_1_2.and(0, 0);
        assertEquals(0, result2);
        int result3 = Task1_1_2.and(-10, 10);
        assertEquals(2, result3);
    }
    @Test
    @DisplayName("Тестирование операции ИЛИ")
    public void or(){
        int result1 = Task1_1_2.or(1, 1);
        assertEquals(1, result1);
        int result2 = Task1_1_2.or(0, 0);
        assertEquals(0, result2);
        int result3 = Task1_1_2.or(-10, 10);
        assertEquals(-2, result3);
    }
}
