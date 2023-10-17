package home_work_3.runners;

import home_work_3.calcs.additional.*;
import home_work_3.calcs.simple.*;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoChoiceAgregation calculator1 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        CalculatorWithCounterAutoChoiceAgregation calculator2 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoChoiceAgregation calculator3 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());

        double result;

        result = calculator1.add(4.1, calculator1.add(calculator1.multiply(15, 7), calculator1.pow(calculator1.divide(28, 5), 2)));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Было проведено " + calculator1.getCountOperation() + " операций");

        result = calculator2.add(4.1, calculator2.add(calculator2.multiply(15, 7), calculator2.pow(calculator2.divide(28, 5), 2)));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Было проведено " + calculator1.getCountOperation() + " операций");

        result = calculator3.add(4.1, calculator3.add(calculator3.multiply(15, 7), calculator3.pow(calculator3.divide(28, 5), 2)));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Было проведено " + calculator1.getCountOperation() + " операций");
    }
}
