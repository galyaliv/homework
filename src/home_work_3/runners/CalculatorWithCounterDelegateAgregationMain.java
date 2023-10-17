package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregation calculatorWithCounter = new CalculatorWithCounterAutoAgregation(calculator);

        double result;

        result = calculatorWithCounter.add(4.1, calculatorWithCounter.add(calculatorWithCounter.multiply(15, 7), calculatorWithCounter.pow(calculatorWithCounter.divide(28, 5), 2)));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Было проведено " + calculatorWithCounter.getCountOperation() + " операций");
    }
}
