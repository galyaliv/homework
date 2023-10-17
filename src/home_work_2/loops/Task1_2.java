/*Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести
ход вычислений в консоль. Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение
о том что пользователь ввёл некорректные данные.
1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число*/

package home_work_2.loops;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        for (String arg : args) {
            if (isDouble(arg)) {
                System.out.println("Введено не целое число: " + arg);
                continue;
            }
            if (isText(arg)) {
                System.out.println("Введено не число: " + arg);
                continue;
            }

            int result = addAllDigit(arg);
            String format = prepareForJob(arg, result);

            System.out.println(format);
        }
    }

    public static int addAllDigit(String line){
        int result = 1;
        int length = line.length();
        for (int i = 0; i < length; i++) {
            result *= Character.getNumericValue(line.charAt(i));
        }
        return result;
    }

    public static String prepareForJob(String line, int result){
        int length = line.length();
        StringBuilder format = new StringBuilder();

        for (int i = 0; i < length; i++) {
            format.append(line.charAt(i));
        }
        //////////////
        return line;
    }

    public static boolean isDouble (String arg){
        int argLength = arg.length();
        boolean foundPoint = false;

        for (int i = 0; i < argLength; i++) {
            char ch = arg.charAt(i);

            if (ch == '.' || ch == ',') {
                if (foundPoint) {
                    return false;
                }
                foundPoint = true;
            }
            else if (Character.isLetter(ch)) {
                return false;
            }
        }
        return false;
    }

    public static boolean isText(String arg){
        int argLength = arg.length();
        boolean foundWord = false;

        for (int i = 0; i < argLength; i++) {
            char ch = arg.charAt(i);

            if (ch == '.' || ch == ','){
                if(foundWord){
                    return true;
                }
                foundWord = true;
            }
            else if (Character.isLetter(ch)) {
               return true;
            }
        }

        return false;
    }
}
