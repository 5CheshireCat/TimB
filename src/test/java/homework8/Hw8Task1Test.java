package homework8;

import com.homework8.Hw8Task1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Hw8Task1Test {
    final Calculator calc = new Calculator();
    private Hw8Task1 hw8Task1;

    @Before
    public void setUp() throws Exception {
        hw8Task1 = new Hw8Task1();
    }

    @Test
    public void positiveNumbers() {
        int given = 12;
        int expected = 12;
        int actual = calc.sumOfDigits(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sumOfNumbers() {
        int given = 000001;
        int expected = 999999;

        int actual = calc.sumOfDigits(given);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void negativeNumber() {
        int given = -9;
        calc.sumOfDigits(given);
    }

    private class Calculator {
        public int sumOfDigits(int given) {
            return given;
        }
    }

}