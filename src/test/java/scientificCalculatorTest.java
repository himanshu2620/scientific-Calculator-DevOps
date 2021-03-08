
import org.junit.Test;
import static org.junit.Assert.*;
import scientificCalculator.calculator;

public class scientificCalculatorTest {
    calculator calc = new calculator();
    private static double delta = 1e-3;
    @Test
    public void squareRootTesting(){
        assertEquals("true positive square root",16,calc.getSquareRoot(256),delta);
        assertEquals("true positive square root",2.828,calc.getSquareRoot(8),delta);
        assertEquals("true positive square root",3.937,calc.getSquareRoot(15.5),delta);
        assertNotEquals("false positive square root",15,calc.getSquareRoot(256),delta);
        assertNotEquals("false positive square root",2.92,calc.getSquareRoot(8),delta);
        assertNotEquals("false positive square root",3.855,calc.getSquareRoot(15.5),delta);
    }
    @Test
    public void factorialTesting(){
        assertEquals("true positive factorial",120,calc.getFactorial(5),delta);
        assertEquals("true positive factorial",3628800,calc.getFactorial(10),delta);
        assertEquals("true positive factorial",1,calc.getFactorial(0),delta);
        assertNotEquals("false positive factorial",0,calc.getFactorial(0),delta);
        assertNotEquals("false positive factorial",100,calc.getFactorial(6),delta);
        assertNotEquals("false positive factorial",450,calc.getFactorial(11),delta);
    }

    @Test
    public void naturalLogTesting(){
        assertEquals("true positive natural log",1.386,calc.getNaturalLog(4),delta);
        assertEquals("true positive natural log",4.605,calc.getNaturalLog(100),delta);
        assertEquals("true positive natural log",0,calc.getNaturalLog(1),delta);
        assertNotEquals("false positive natural log",0,calc.getNaturalLog(2.7),delta);
        assertNotEquals("false positive natural log",4.2,calc.getNaturalLog(80),delta);
        assertNotEquals("false positive natural log",2.5,calc.getNaturalLog(11),delta);
    }
    @Test
    public void powerfunctionTesting(){
        assertEquals("true positive power",25,calc.getPower(5,2),delta);
        assertEquals("true positive power",6.25,calc.getPower(2.5,2),delta);
        assertEquals("true positive power",9.882,calc.getPower(2.5,2.5),delta);
        assertNotEquals("false positive power",15,calc.getPower(4,2),delta);
        assertNotEquals("false positive power",0,calc.getPower(2,0),delta);
        assertNotEquals("false positive power",9,calc.getPower(3,3),delta);
    }

}
