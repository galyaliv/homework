//Перевести байты в килобайты или наоборот

package home_work_1;
import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Для перевода из байтов в килобайты нажмите 1, для перевода из килобайтов в байты нажмите 2: ");
        byte num = in.nextByte();

        if (num == 1) {
            System.out.print("Введите количество байт: ");
            float b = in.nextFloat();
            float kb = toKb(b);
            System.out.println(b + " байт - " + kb + " килобайт");
        }
        else if (num == 2) {
            System.out.print("Введите количество байт: ");
            float kb = in.nextFloat();
            float b = toB(kb);
            System.out.println(kb + " килобайт - " + b + " байт");
        }
        else {
            System.out.print("Число введено неверно, введите 1 или 2");
        }
    }

    public static float toKb(float b){
        return b/1024;
    }

    public static float toB(float kb){
        return kb*1024;
    }
}
