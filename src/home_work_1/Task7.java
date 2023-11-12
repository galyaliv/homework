package home_work_1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 10 цифр номера телефона: ");
        String input = scanner.nextLine();

        if (createPhoneNumber(input) != null) {
            System.out.println(createPhoneNumber(input));
        }
        else {
            System.out.println("Некорректный номер");
        }
    }

    /**
     * Принимает массив цифр и преобразовывает в строку формата (XXX) XXX-XXXX
     * @param input введенная пользователем строка
     * @return строку формата (XXX) XXX-XXXX. При некорректром вводе возвращает null
     */
    public static String createPhoneNumber(String input) {
        int[] numbers = new int[10];
        for (int i = 0; i <= 9; i++) {
            if (Character.isDigit(input.charAt(i)) && input.length() == 10) {
                numbers[i] = Character.getNumericValue(input.charAt(i));
            }
            else {
                return null;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                result.append("(").append(numbers[i]);
            }
            if ((i >= 1 && i <= 2) || (i >= 4 && i <= 5) || i >= 7) {
                result.append(numbers[i]);
            }
            else if (i == 3) {
                result.append(") ").append(numbers[i]);
            }
            else if (i == 6) {
                result.append("-").append(numbers[i]);
            }
        }
        return result.toString();
    }
}