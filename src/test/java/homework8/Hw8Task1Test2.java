package homework8;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class Hw8Task1Test2 {
    private Hw8Task1 target;
    private Hw8Task1 hw8Task1;
    private Object Hw8Task1;

    @Before
    public void setUp() throws Exception {
        target = new Hw8Task1();
        Hw8Task1 = Mockito.mock(Hw8Task1.class);
    }

    @Test
    public void main() {
        final int expected = 55251;
        final int actual = hw8Task1.sum;
        Mockito.when(Hw8Task1.equals(target.sum));
}
}