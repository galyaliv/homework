//Буква или иной символ

package home_work_1;
import java.util.Scanner;

public class Task4_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите символ: ");
        char ch = in.nextLine().charAt(0);
        boolean isLetter = isLetter(ch);

        if (isLetter){
            System.out.println("Символ " + ch + " является буквой");
        }
        else {
            System.out.println("Символ " + ch + " не является буквой");
        }
    }

    public static boolean isLetter(char ch){
        if (Character.isLetter(ch)) {
            return true;
        }
        else {
            return false;
        }
    }
}