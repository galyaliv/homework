package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        double result;
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();

        result = calculator.add(4.1, calculator.add(calculator.multiply(15, 7), calculator.pow(calculator.divide(28, 5), 2)));
        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}
