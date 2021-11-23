package homework8;

import homework3.Hw3Task2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Hw8Task2Test {
    private Hw3Task2 hw8Task2;

    @Before
    public void setUp() throws Exception {
        hw8Task2 = new Hw3Task2();
    }

    @Test
    public void main() {
        final int expected = 5;
        final int actual = 5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void main2() {
        final int expected = 5;
        final int actual = 5;
        Assert.assertEquals(expected, actual);
        fail();
    }

}