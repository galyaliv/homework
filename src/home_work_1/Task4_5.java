//Буква или иной символ

package home_work_1;
import java.util.Scanner;

public class Task4_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ввод пользователем символа
        System.out.print("Введите символ: ");
        char ch = in.nextLine().charAt(0);
        if (Character.isLetter(ch)) { //проверка переменной а
            System.out.println("Символ " + ch + " является буквой"); //печать результата
        }
        else {
            System.out.println("Символ " + ch + " не является буквой"); //печать результата
        }
    }
}