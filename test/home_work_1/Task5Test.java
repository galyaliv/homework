package home_work_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task5Test {
    @Test
    @DisplayName("Рабочий день, отпуск")
    public void sleepIn1(){
        boolean result = Task5.sleepIn(true, true);
        assertTrue(result);
    }
    @Test
    @DisplayName("Рабочий день, не отпуск")
    public void sleepIn2(){
        boolean result = Task5.sleepIn(true, false);
        assertFalse(result);
    }
    @Test
    @DisplayName("Не рабочий день, отпуск")
    public void sleepIn3(){
        boolean result = Task5.sleepIn(false, true);
        assertTrue(result);
    }
    @Test
    @DisplayName("Не рабочий день, не отпуск")
    public void sleepIn4(){
        boolean result = Task5.sleepIn(false, false);
        assertTrue(result);
    }
}
