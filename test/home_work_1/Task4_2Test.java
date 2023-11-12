package home_work_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4_2Test {
    @Test
    @DisplayName("Первое число - среднее")
    public void avg_1(){
        double result = Task4_2.avg(2, 1, 3);
        assertEquals(2, result);
    }
    @Test
    @DisplayName("Второе число - среднее")
    public void avg_2(){
        double result = Task4_2.avg(4, 5, 6);
        assertEquals(5, result);
    }
    @Test
    @DisplayName("Третье число - среднее")
    public void avg_3(){
        double result = Task4_2.avg(7, 9, 8);
        assertEquals(8, result);
    }
}
