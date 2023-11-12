package home_work_3.calcs.simple;

//import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithOperatorTest {
    @Test
    public void add(){
        CalculatorWithOperator calc = new CalculatorWithOperator();

        double result = calc.add(1, 2);

        Assertions.assertEquals(3, result);
    }
}
