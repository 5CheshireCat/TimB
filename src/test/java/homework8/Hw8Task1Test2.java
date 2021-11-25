package homework8;

import com.homework8.Hw8Task1;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class Hw8Task1Test2 {
    private com.homework8.Hw8Task1 target;
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