package home_work_1;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class Task6_1Test {
    public void add(){
        CalculatorWithOperator calc = new CalculatorWithOperator();

        double result = calc.add(1, 2);

        Assertions.assertEquals(3, result);
    }
}
