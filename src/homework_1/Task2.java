/*2. Изучить приоритетность операторов по таблице в презентации. Сначала посчитать результаты всех ниже
приведённых примеров устно, а потом проверить в IDE (в случае ошибок свериться с таблицей приоритетов,
повторять просчёт примеров до полного соответствия). Результатом МОЖЕТ БЫТЬ ОШИБКА компиляции, МОЖЕТ БЫТЬ ОШИБКА
выполнения программы или корректный результат. Все значения в этих переменных должны быть записаны
в int и boolean переменные. Напротив каждой строчки нужно написать комментарий с результатом и объяснением
почему вы получили такой результат.
Пояснение: ВНИМАНИЕ --8 значит что вам нужно создать переменную, например а, и проинициализировать её 8,
а дальше её использовать как --а. Данная переменная во всех выражениях должна равняться 8;
	2.1 5 + 2 / 8
	2.2 (5 + 2) / 8
	2.3 (5 + 2++) / 8
	2.4 (5 + 2++) / --8
	2.5 (5 * 2 >> 2++) / --8
	2.6 (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8
	2.7 (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8
	2.8 6 - 2 > 3 && 12 * 12 <= 119
	2.9 true && false */

package homework_1;

public class Task2 {
    public static void main(String[] args) {
        //создание переменный a и b для последующей инициализации
        int a;
        int b;

        // 5 + 2 / 8 = 5.25, однако в переменной типа int значение округлится вниз до целого - 5
        int x1 = 5 + 2 / 8; //создание переменной, помещение в нее значения выражения
        System.out.println("2.1 5 + 2 / 8 = " + x1); //печать результата

        // (5 + 2) / 8 = 0.75, однако в переменной типа int значение округлится вниз до целого - 0
        int x2 = (5 + 2) / 8; //создание переменной, помещение в нее значения выражения
        System.out.println("2.2 (5 + 2) / 8 = " + x2); //печать результата

        // (5 + 2++) / 8 = 0.75, однако в переменной типа int значение округлится вниз до целого - 0
        a = 2;  //инициализация переменной a
        int x3 = (5 + a++) / 8; //создание переменной, помещение в нее значения выражения
        System.out.println("2.3 (5 + 2++) / 8 = " + x3); //печать результата

        // (5 + 2++) / --8 = 1
        a = 2; //обновление значения переменной a
        b = 8; //инициализация переменной b
        int x4 = (5 + a++) / --b; //создание переменной, помещение в нее значения выражения
        System.out.println("2.4 (5 + 2++) / --8 = " + x4); //печать результата

        // (5 * 2 >> 2++) / --8 = 0.2857, однако в переменной типа int значение округлится вниз до целого - 0
        a = 2; //обновление значения переменной a
        b = 8; //обновление значения переменной b
        int x5 = (5 * 2 >> a++) / --b; //создание переменной, помещение в нее значения выражения
        System.out.println("2.5 (5 * 2 >> 2++) / --8 = " + x5); //печать результата

        // (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8 = 1.57, однако в переменной типа int значение округлится вниз до целого - 1
        a = 2; //обновление значения переменной a
        b = 8; //обновление значения переменной b
        int x6 = (5 + 7 > 20 ? 68 : 22 * 2 >> a++) / --b; //создание переменной, помещение в нее значения выражения
        System.out.println("2.6 (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8 = " + x6); //печать результата

        // (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8 выведет ошибку из-за фрагмента оператора >=, не дающего завершить оператор ?:
        a = 2; //обновление значения переменной a
        b = 8; //обновление значения переменной b
        //int x7 = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> a++) / --b; //создание переменной, помещение в нее значения выражения
        System.out.println("2.7 (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8: ошибка компиляции"); //печать результата

        // 6 - 2 > 3 && 12 * 12 <= 119 выведет ошибку
        //int x8 = 6 - 2 > 3 && 12 * 12 <= 119;  //создание переменной, помещение в нее значения выражения
        System.out.println("2.8 6 - 2 > 3 && 12 * 12 <= 119 : ошибка компиляции"); //печать результата

        // true && false = false
        boolean x9 = true && false; //создание переменной, помещение в нее значения выражения
        System.out.println("2.9 true && false = " + x9); //печать результата
    }
}
