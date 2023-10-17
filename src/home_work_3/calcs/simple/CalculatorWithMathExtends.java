package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    /**
     * Метод возводит дробное положительное число в целую степень
     * @param indicator основание степени
     * @param degree показатель степени
     * @return результат возведения основания в степень. В случае некорректного основания возвращает -1
     */
    @Override
    public double pow(double indicator, int degree){
        if(indicator <= 0){
            return -1;
        }
        return Math.pow(indicator, degree);
    }

    /**
     * Метод определяет модуль числа типа double
     * @param number число, для которого определяется модуль
     * @return модуль числа типа double
     */
    @Override
    public double absolute(double number){
        return Math.abs(number);
    }

    /**
     * Метод определяет модуль числа типа int
     * @param number число, для которого определяется модуль
     * @return модуль числа типа int
     */
    @Override
    public int absolute(int number){
        return Math.abs(number);
    }

    /**
     * Метод вычисляет квадратный корень числа
     * @param number число, из которого извлекается корень
     * @return квадратный корень числа. В случае некорректного ввода числа, возвращает -1
     */
    @Override
    public double root(int number){
        if (number < 0){
            return -1;
        }
        else {
            return Math.sqrt(number);
        }
    }
}
