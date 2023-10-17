package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();
        double result;

        result = calculator.add(4.1, calculator.add(calculator.multiply(15, 7), calculator.pow(calculator.divide(28, 5), 2)));
        calculator.incrementCountOperation();
        calculator.incrementCountOperation();
        calculator.incrementCountOperation();
        calculator.incrementCountOperation();
        calculator.incrementCountOperation();

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Было проведено " + calculator.getCountOperation() + " операций");
    }
}
