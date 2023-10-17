package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {
    private CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculator) {
        this.calculator = calculator;
    }

    private long counter = 0;

    /**
     * Метод выполняет деление одного числа на другое, увеличивает счетчик операций
     * @param dividend делимое
     * @param divisor делитель
     * @return результат от деления делимого на делитель
     */
    public double divide(double dividend, double divisor){
        counter++;
        return calculator.divide(dividend, divisor);
    }

    /**
     * Метод выполняет перемножение двух чисел, увеличивает счетчик операций
     * @param factor1 первый множитель
     * @param factor2 второй множитель
     * @return результат от умножения двух множителей
     */
    public double multiply(double factor1, double factor2){
        counter++;
        return calculator.multiply(factor1, factor2);
    }

    /**
     * Метод выполняет сложение двух чисел, увеличивает счетчик операций
     * @param term1 первое слагаемое
     * @param term2 второе слагаемое
     * @return сумма двух слагаемых
     */
    public double add(double term1, double term2){
        counter++;
        return calculator.add(term1, term2);
    }

    /**
     * Метод выполняет вычитание одного числа из другого, увеличивает счетчик операций
     * @param minuend уменьшаемое
     * @param subtrahend вычитаемое
     * @return разность уменьшаемого и вычитаемого
     */
    public double subtract(double minuend, double subtrahend){
        counter++;
        return calculator.subtract(minuend, subtrahend);
    }

    /**
     * Метод возводит дробное положительное число в целую степень, увеличивает счетчик операций
     * @param indicator основание степени
     * @param degree показатель степени
     * @return результат возведения основания в степень. В случае некорректного основания возвращает -1
     */
    public double pow(double indicator, int degree){
        if(indicator <= 0){
            return -1;
        }
        counter++;
        return calculator.pow(indicator, degree);
    }

    /**
     * Метод определяет модуль числа типа double, увеличивает счетчик операций
     * @param number число, для которого определяется модуль
     * @return модуль числа типа double
     */
    public double absolute(double number){
        counter++;
        return calculator.absolute(number);
    }

    /**
     * Метод определяет модуль числа типа int, увеличивает счетчик операций
     * @param number число, для которого определяется модуль
     * @return модуль числа типа int
     */
    public int absolute(int number){
        counter++;
        return calculator.absolute(number);
    }

    /**
     * Метод вычисляет квадратный корень числа, увеличивает счетчик операций
     * @param number число, из которого извлекается корень
     * @return квадратный корень числа. В случае некорректного ввода числа, возвращает -1
     */
    public double root(int number){
        if (number < 0){
            return -1;
        }
        else {
            counter++;
            return calculator.root(number);
        }
    }

    /**
     * Метод возвращает количество использований данного калькулятора
     * @return количество использований данного калькулятора
     */
    public long getCountOperation(){
        return counter;
    }
}
