/*1.3 В отдельном классе попробуйте сделать побитовую операцию с литералом 42.5,
опишите результат в комментариях в классе с заданием.*/

package home_work_1;
import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //ввод пользователем с клавиатуры первого числа
        System.out.print("Введите первое число: ");
        float num1 = in.nextFloat();
        //создание переменной со значением 42.5
        float num2 = 42.5F;

        //побитовые операции И и ИЛИ
        // System.out.println("Результат операции И: " + (num1 & num2));
        //System.out.println("Результат операции ИЛИ: " + (num1 | num2));
        //Побитовые операции не могут быть выполнены с переменными нецелочисленных форматов
    }
}
