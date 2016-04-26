package recursion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    private Factorial f;
    @Before
    public void setUp() throws Exception {
        f = new Factorial();
    }

    @Test
    public void factorial_5() throws Exception {
        assertEquals(f.factorial(5), 120);
    }

    @Test
    public void factorial_0() {
        assertEquals(f.factorial(0), 1);
    }

    @Test
    public void factorial_tail_0() throws Exception {
        assertEquals(f.factorialTailRec(5,1), 120);
    }

}