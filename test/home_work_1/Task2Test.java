package home_work_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2Test {
    @Test
    @DisplayName("Тестирование x1")
    public void x1(){
        int result = Task2.x1();
        assertEquals(5, result);
    }
    @Test
    @DisplayName("Тестирование x2")
    public void x2(){
        int result = Task2.x2();
        assertEquals(0, result);
    }
    @Test
    @DisplayName("Тестирование x3")
    public void x3(){
        int result = Task2.x3();
        assertEquals(0, result);
    }
    @Test
    @DisplayName("Тестирование x4")
    public void x4(){
        int result = Task2.x4();
        assertEquals(1, result);
    }
    @Test
    @DisplayName("Тестирование x5")
    public void x5(){
        int result = Task2.x5();
        assertEquals(0, result);
    }
    @Test
    @DisplayName("Тестирование x6")
    public void x6(){
        int result = Task2.x6();
        assertEquals(1, result);
    }
    @Test
    @DisplayName("Тестирование x9")
    public void x9(){
        boolean result = Task2.x9();
        assertEquals(false, result);
    }
}
