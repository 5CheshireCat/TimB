package homework8;

import com.homework8.Hw8Task1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Hw8Task1Test {

    private Hw8Task1 hw8Task1;

    @Before
    public void setUp() throws Exception {
        hw8Task1 = new Hw8Task1();
    }

    @Test
    public void sum_positiveNumbers() {
        int expected = 55251;
        int actual = 55251;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sum_positiveNumbers2() {
        final int expected = 55251;
        final int actual = hw8Task1.sum++;
        Assert.assertEquals(expected, actual);
    }

}