package home_work_3.calcs.api;

public interface ICalculator {
    /**
     * Метод выполняет деление одного числа на другое, увеличивает счетчик операций
     * @param dividend делимое
     * @param divisor делитель
     * @return результат от деления делимого на делитель
     */
    double divide(double dividend, double divisor);

    /**
     * Метод выполняет перемножение двух чисел, увеличивает счетчик операций
     * @param factor1 первый множитель
     * @param factor2 второй множитель
     * @return результат от умножения двух множителей
     */
    double multiply(double factor1, double factor2);

    /**
     * Метод выполняет сложение двух чисел, увеличивает счетчик операций
     * @param term1 первое слагаемое
     * @param term2 второе слагаемое
     * @return сумма двух слагаемых
     */
    double add(double term1, double term2);

    /**
     * Метод выполняет вычитание одного числа из другого, увеличивает счетчик операций
     * @param minuend уменьшаемое
     * @param subtrahend вычитаемое
     * @return разность уменьшаемого и вычитаемого
     */
    double subtract(double minuend, double subtrahend);

    /**
     * Метод возводит дробное положительное число в целую степень, увеличивает счетчик операций
     * @param indicator основание степени
     * @param degree показатель степени
     * @return результат возведения основания в степень. В случае некорректного основания возвращает -1
     */
    double pow(double indicator, int degree);

    /**
     * Метод определяет модуль числа типа double, увеличивает счетчик операций
     * @param number число, для которого определяется модуль
     * @return модуль числа типа double
     */
    double absolute(double number);

    /**
     * Метод определяет модуль числа типа int, увеличивает счетчик операций
     * @param number число, для которого определяется модуль
     * @return модуль числа типа int
     */
    int absolute(int number);

    /**
     * Метод вычисляет квадратный корень числа, увеличивает счетчик операций
     * @param number число, из которого извлекается корень
     * @return квадратный корень числа. В случае некорректного ввода числа, возвращает -1
     */
    double root(int number);
}
