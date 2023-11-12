package home_work_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task4_5Test {
    @Test
    @DisplayName("Проверка латиницы маленькая буква")
    public void isLetter1(){
        boolean result = Task4_5.isLetter('n');
        assertTrue(result);
    }
    @Test
    @DisplayName("Проверка латиницы большая буква")
    public void isLetter2(){
        boolean result = Task4_5.isLetter('L');
        assertTrue(result);
    }

    @Test
    @DisplayName("Проверка кириллицы маленькая буква")
    public void isLetter3(){
        boolean result = Task4_5.isLetter('ж');
        assertTrue(result);
    }
    @Test
    @DisplayName("Проверка кириллицы большая буква")
    public void isLetter4(){
        boolean result = Task4_5.isLetter('Ц');
        assertTrue(result);
    }
    @Test
    @DisplayName("Проверка ў")
    public void isLetter5(){
        boolean result = Task4_5.isLetter('ў');
        assertTrue(result);
    }
    @Test
    @DisplayName("Проверка цифры")
    public void isLetter6(){
        boolean result = Task4_5.isLetter('9');
        assertFalse(result);
    }
    @Test
    @DisplayName("Проверка символов")
    public void isLetter7(){
        boolean result = Task4_5.isLetter('.');
        assertFalse(result);
    }
    @Test
    @DisplayName("Проверка символов")
    public void isLetter8(){
        boolean result = Task4_5.isLetter('+');
        assertFalse(result);
    }

}
