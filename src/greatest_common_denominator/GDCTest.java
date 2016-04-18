package greatest_common_denominator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GDCTest {
    private GDC gdc;

    @Before
    public void setUp() {
        gdc = new GDC();
    }

    @Test
    public void handlesTwoInts() {
        int result = gdc.findDenominator(4,2);
        assertEquals(result,2);
    }
    @Test
    public void handlesAnotherTwoInts() {
        int result = gdc.findDenominator(12,8);
        assertEquals(result,4);
    }
    @Test
    public void handlesCoprimes() {
        int result = gdc.findDenominator(7,6);
        assertEquals(result,1);
    }
}
