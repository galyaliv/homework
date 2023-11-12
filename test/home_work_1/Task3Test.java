package home_work_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3Test {
    @Test
    @DisplayName("Тестирование квадратного уравнения")
    public void roots1(){
        double[] result = Task3.roots(2, -5, 2);
        double[] expected = {2, 0.5};
        assertArrayEquals(expected, result, 0.000000001);
    }
    @Test
    @DisplayName("Тестирование квадратного уравнения")
    public void roots2(){
        double[] result = Task3.roots(3, 6, 3);
        double[] expected = {-1, -1};
        assertArrayEquals(expected, result, 0.000000001);
    }
    @Test
    @DisplayName("Тестирование квадратного уравнения")
    public void roots3(){
        double[] result = Task3.roots(3, 6, 3);
        double[] expected = {-1, -1};
        assertArrayEquals(expected, result, 0.000000001);
    }
    @Test
    @DisplayName("Тестирование первого примера")
    public void equation1_1(){
        double result = Task3.equation1(30);
        assertEquals(538.4489775, result, 0.0000001);
    }
    @Test
    @DisplayName("Тестирование второго примера")
    public void equation1_2(){
        double result = Task3.equation1(-30);
        assertEquals(538.4489775, result, 0.0000001);
    }
    @Test
    @DisplayName("Тестирование первого примера")
    public void equation2_1(){
        double result = Task3.equation2(100);
        assertEquals(21.29576357, result, 0.0000001);
    }
    @Test
    @DisplayName("Тестирование второго примера")
    public void equation2_2(){
        double result = Task3.equation2(-100);
        assertEquals(21.29576357, result, 0.0000001);
    }

}
