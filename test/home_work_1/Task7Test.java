package home_work_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Task7Test {
    @Test
    @DisplayName("10 цифр")
    public void createPhoneNumber1(){
        String result = Task7.createPhoneNumber("0123456789");
        assertEquals("(012) 345-6789", result);
    }
    @Test
    @DisplayName("Неправильное количество цифр")
    public void createPhoneNumber2(){
        String result = Task7.createPhoneNumber("012345");
        assertNull(result);
    }
    @Test
    @DisplayName("Буква в номере")
    public void createPhoneNumber3(){
        String result = Task7.createPhoneNumber("w123456789");
        assertNull(result);
    }
}
