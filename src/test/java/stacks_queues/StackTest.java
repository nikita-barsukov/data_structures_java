package stacks_queues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    private Stack stack;
    @Before
    public void setUp() throws Exception {
        stack = new Stack();
        stack.push('a');
        stack.push('b');
        stack.push(5);
        stack.push(5.5);
    }

    @Test
    public void isEmpty() throws Exception {
        Stack emptyStack = new Stack();
        assertTrue(emptyStack.isEmpty());
    }

    @Test
    public void push() throws Exception {
        stack.push(10);
        assertEquals(stack.peek(), 10);
    }

    @Test
    public void peek() throws Exception {
        assertEquals(stack.peek(), 5.5);
    }

    @Test
    public void pop() throws Exception {
        stack.pop();
        assertEquals(stack.peek(), 5);
    }
}
