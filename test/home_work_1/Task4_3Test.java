package home_work_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task4_3Test {
    @Test
    @DisplayName("Проверка одинаковых чисел")
    public void isDivisible1(){
        boolean result = Task4_3.isDivisible(1, 1);
        assertTrue(result);
    }
    @Test
    @DisplayName("Первое больше другого и делится")
    public void isDivisible2(){
        boolean result = Task4_3.isDivisible(4, 2);
        assertTrue(result);
    }
    @Test
    @DisplayName("Первое меньше другого и делится")
    public void isDivisible3(){
        boolean result = Task4_3.isDivisible(3, 6);
        assertTrue(result);
    }
    @Test
    @DisplayName("Первое больше другого и НЕ делится")
    public void isDivisible4(){
        boolean result = Task4_3.isDivisible(7, 2);
        assertFalse(result);
    }
    @Test
    @DisplayName("Первое меньше другого и НЕ делится")
    public void isDivisible5(){
        boolean result = Task4_3.isDivisible(3, 8);
        assertFalse(result);
    }
}
