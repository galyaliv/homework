//Буква или иной символ

package homework_1;
import java.util.Scanner;

public class Task4_5 {
    public static void main(String[] args) {
        char ch = 'й'; //создание переменное и ее инициализация
        if (Character.isLetter(ch)) { //проверка переменной а
            System.out.println("Символ " + ch + " является буквой"); //печать результата
        }
        else {
            System.out.println("Символ " + ch + " не является буквой"); //печать результата
        }
    }
}