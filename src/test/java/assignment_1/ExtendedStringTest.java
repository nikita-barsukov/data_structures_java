package assignment_1;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExtendedStringTest {
    private ExtendedString ext_strng;

    @Test
    public void handlesStringWithNoDuplicates(){
        ext_strng = new ExtendedString("abc");
        assertFalse(ext_strng.hasDuplicatedChars());
    }
    @Test
    public void handlesStringWithDuplicates(){
        ext_strng = new ExtendedString("reddit");
        assertTrue(ext_strng.hasDuplicatedChars());
    }
    @Test
    public void handlesEmptyString(){
        ext_strng = new ExtendedString("");
        assertFalse(ext_strng.hasDuplicatedChars());
    }
    @Test
    public void handlesStringWithSingleChar(){
        ext_strng = new ExtendedString("a");
        assertFalse(ext_strng.hasDuplicatedChars());
    }
}