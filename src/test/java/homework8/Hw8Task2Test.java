package homework8;

import com.homework8.Hw8Task1;
import com.homework8.Hw8Task2;
import com.sun.tools.javac.Main;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class Hw8Task2Test {
    private com.homework8.Hw8Task2 target;
    private Object Hw8Task2;
    private com.homework8.Hw8Task2 hw8Task2;
    private Object thenReturn;


    @Before
    public void setUp() throws Exception {
        target = new Hw8Task2();
        Hw8Task2 = Mockito.mock(Hw8Task2.class);
    }
    @Test
    public void Calculator() {
        Main mainmock = Mockito.mock(Main.class);
        Mockito.when(Hw8Task2.equals(target.getClass())).thenReturn((Boolean) Hw8Task2);
    }

}