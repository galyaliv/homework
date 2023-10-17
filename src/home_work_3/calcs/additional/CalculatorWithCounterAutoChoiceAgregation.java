package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathCopy calculatorWithMathCopy;
    private CalculatorWithMathExtends calculatorWithMathExtends;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculator) {
        calculatorWithOperator = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculator) {
        calculatorWithMathCopy = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculator) {
        calculatorWithMathExtends = calculator;
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
        if(calculatorWithOperator != null){
            return calculatorWithOperator.divide(dividend, divisor);
        }
        else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.divide(dividend, divisor);
        }
        else {
            return calculatorWithMathExtends.divide(dividend, divisor);
        }
    }

    /**
     * Метод выполняет перемножение двух чисел, увеличивает счетчик операций
     * @param factor1 первый множитель
     * @param factor2 второй множитель
     * @return результат от умножения двух множителей
     */
    public double multiply(double factor1, double factor2){
        counter++;
        if(calculatorWithOperator != null){
            return calculatorWithOperator.multiply(factor1, factor2);
        }
        else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.multiply(factor1, factor2);
        }
        else {
            return calculatorWithMathExtends.multiply(factor1, factor2);
        }
    }

    /**
     * Метод выполняет сложение двух чисел, увеличивает счетчик операций
     * @param term1 первое слагаемое
     * @param term2 второе слагаемое
     * @return сумма двух слагаемых
     */
    public double add(double term1, double term2){
        counter++;
        if(calculatorWithOperator != null){
            return calculatorWithOperator.add(term1, term2);
        }
        else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.add(term1, term2);
        }
        else {
            return calculatorWithMathExtends.add(term1, term2);
        }
    }

    /**
     * Метод выполняет вычитание одного числа из другого, увеличивает счетчик операций
     * @param minuend уменьшаемое
     * @param subtrahend вычитаемое
     * @return разность уменьшаемого и вычитаемого
     */
    public double subtract(double minuend, double subtrahend){
        counter++;
        if(calculatorWithOperator != null){
            return calculatorWithOperator.subtract(minuend, subtrahend);
        }
        else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.subtract(minuend, subtrahend);
        }
        else {
            return calculatorWithMathExtends.subtract(minuend, subtrahend);
        }
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
        if(calculatorWithOperator != null){
            return calculatorWithOperator.pow(indicator, degree);
        }
        else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.pow(indicator, degree);
        }
        else {
            return calculatorWithMathExtends.pow(indicator, degree);
        }
    }

    /**
     * Метод определяет модуль числа типа double, увеличивает счетчик операций
     * @param number число, для которого определяется модуль
     * @return модуль числа типа double
     */
    public double absolute(double number){
        counter++;
        if(calculatorWithOperator != null){
            return calculatorWithOperator.absolute(number);
        }
        else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.absolute(number);
        }
        else {
            return calculatorWithMathExtends.absolute(number);
        }
    }

    /**
     * Метод определяет модуль числа типа int, увеличивает счетчик операций
     * @param number число, для которого определяется модуль
     * @return модуль числа типа int
     */
    public int absolute(int number){
        counter++;
        if(calculatorWithOperator != null){
            return calculatorWithOperator.absolute(number);
        }
        else if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.absolute(number);
        }
        else {
            return calculatorWithMathExtends.absolute(number);
        }
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
            if(calculatorWithOperator != null){
                return calculatorWithOperator.root(number);
            }
            else if (calculatorWithMathCopy != null) {
                return calculatorWithMathCopy.root(number);
            }
            else {
                return calculatorWithMathExtends.root(number);
            }
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
