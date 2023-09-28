//Перевести байты в килобайты или наоборот

package home_work_1;
import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ввод пользователем значений
        System.out.print("Для перевода из байтов в килобайты нажмите 1, для перевода из килобайтов в байты нажмите 2: ");
        byte num = in.nextByte();

        //перевод из байтов в килобайты
        if (num == 1) {
            //ввод пользователем значений
            System.out.print("Введите количество байт: ");
            float b = in.nextFloat();
            System.out.println(b + " байт - " + b/1024 + " килобайт"); //печать результата
        }
        //перевод из килобайтов в байты
        else if (num == 2) {
            //ввод пользователем значений
            System.out.print("Введите количество байт: ");
            int kb = in.nextInt();
            System.out.println(kb + " килобайт - " + kb*1024 + " байт"); //печать результата
        }
        //ошибка ввода
        else {
            System.out.print("Число введено неверно, введите 1 или 2"); //печать результата
        }
    }
}
