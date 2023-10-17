package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
    /**
     * Метод выполняет деление одного числа на другое
     * @param dividend делимое
     * @param divisor делитель
     * @return результат от деления делимого на делитель
     */
    public double divide(double dividend, double divisor){
        return dividend / divisor;
    }

    /**
     * Метод выполняет перемножение двух чисел
     * @param factor1 первый множитель
     * @param factor2 второй множитель
     * @return результат от умножения двух множителей
     */
    public double multiply(double factor1, double factor2){
        return factor1 * factor2;
    }

    /**
     * Метод выполняет сложение двух чисел
     * @param term1 первое слагаемое
     * @param term2 второе слагаемое
     * @return сумма двух слагаемых
     */
    public double add(double term1, double term2){
        return term1 + term2;
    }

    /**
     * Метод выполняет вычитание одного числа из другого
     * @param minuend уменьшаемое
     * @param subtrahend вычитаемое
     * @return разность уменьшаемого и вычитаемого
     */
    public double subtract(double minuend, double subtrahend){
        return minuend - subtrahend;
    }

    /**
     * Метод возводит дробное положительное число в целую степень
     * @param indicator основание степени
     * @param degree показатель степени
     * @return результат возведения основания в степень. В случае некорректного основания возвращает -1
     */
    public double pow(double indicator, int degree){
        double result;

        if(indicator <= 0){
            return -1;
        }
        if(degree == 0){
            return 1;
        }

        result = indicator;
        if(degree >= 1) {
            for (; degree > 1; degree--) {
                result *= indicator;
            }
            return result;
        }
        else {
            degree = -degree;
            for (; degree > 1; degree--) {
                result *= indicator;
            }
            return 1 / result;
        }
    }

    /**
     * Метод определяет модуль числа типа double
     * @param number число, для которого определяется модуль
     * @return модуль числа типа double
     */
    public double absolute(double number){
        if (number < 0){
            return -number;
        }
        else {
            return number;
        }
    }

    /**
     * Метод определяет модуль числа типа int
     * @param number число, для которого определяется модуль
     * @return модуль числа типа int
     */
    public int absolute(int number){
        if (number < 0){
            return -number;
        }
        else {
            return number;
        }
    }

    /**
     * Метод вычисляет квадратный корень числа
     * @param number число, из которого извлекается корень
     * @return квадратный корень числа. В случае некорректного ввода числа, возвращает -1
     */
    public double root(int number){
        if (number < 0){
            return -1;
        }
        else {
            return Math.sqrt(number);
        }
    }
}
