package home_work_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task4_1Test {
    @Test
    @DisplayName("Проверка четных")
    public void isEven(){
        boolean result = Task4_1.isEven(2);
        assertTrue(result);
    }
    @Test
    @DisplayName("Проверка нечетных")
    public void isUnEven(){
        boolean result = Task4_1.isEven(1);
        assertFalse(result);
    }
}
