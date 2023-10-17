package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long counter = 0;

    /**
     * Метод увеличивает внутренний счетчик в калькуляторе
     */
    public void incrementCountOperation(){
        counter++;
    }

    /**
     * Метод возвращает количество использований данного калькулятора
     * @return количество использований данного калькулятора
     */
    public long getCountOperation(){
        return counter;
    }
}
