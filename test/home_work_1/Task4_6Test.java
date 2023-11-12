package home_work_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task4_6Test {
    @Test
    @DisplayName("Проверка 2024")
    public void isLeap1(){
        boolean result = Task4_6.isLeap(2024);
        assertTrue(result);
    }
    @Test
    @DisplayName("Проверка 2000")
    public void isLeap2(){
        boolean result = Task4_6.isLeap(2000);
        assertTrue(result);
    }
    @Test
    @DisplayName("Проверка 2001")
    public void isLeap3(){
        boolean result = Task4_6.isLeap(2001);
        assertFalse(result);
    }
    @Test
    @DisplayName("Проверка 1900")
    public void isLeap4(){
        boolean result = Task4_6.isLeap(1900);
        assertFalse(result);
    }

}
