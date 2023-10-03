//1.6. Вывести таблицу умножения в консоль. В консоли должно получиться также как и на картинке

package home_work_2.loops;

public class Task1_6 {
    public static void main(String[] args) {
        int multiplier1 = 2;
        int multiplier2 = 1;
        int result;

        // первый цикл перебирает первый множитель, второй цикл перебирает второй множитель и печатает результат
        for (; multiplier1 <= 9 ;multiplier1++) {
            for (; multiplier2 <= 10; multiplier2++) {
                result = multiplier1 * multiplier2;
                System.out.println(multiplier1 + " * " + multiplier2 + " = " + result);
            }
            multiplier2 = 1;
            System.out.println();
        }
    }
}
