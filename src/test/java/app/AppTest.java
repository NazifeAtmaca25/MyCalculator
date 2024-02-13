package app;

import org.example.app.Calculator;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class AppTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }
    @Test
    public void testSubtrct(){
        Calculator calculator=new Calculator();
        assertEquals(2,calculator.subtract(5,3));
    }
    @Test
    public void testMultiply(){
        Calculator calculator=new Calculator();
        assertEquals(20,calculator.multiply(4,5));
    }
    @Test
    public void testDivide(){
        Calculator calculator=new Calculator();
        assertEquals(2.5,calculator.divide(10,4));
    }

}
