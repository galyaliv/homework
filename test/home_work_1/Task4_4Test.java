package home_work_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task4_4Test {
    @Test
    @DisplayName("Тестирование в килобайты")
    public void toKb(){
        float result = Task4_4.toKb(1024);
        assertEquals(1, result, 0.0000001);
    }
    @Test
    @DisplayName("Тестирование в байты")
    public void toB(){
        float result = Task4_4.toB(1);
        assertEquals(1024, result, 0.0000001);
    }
}
