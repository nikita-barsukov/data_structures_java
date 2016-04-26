package stacks_queues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    private Queue q;
    @Before
    public void setUp() throws Exception {
        q = new Queue();
        q.enqueue('a');
        q.enqueue('b');
        q.enqueue(10);
        q.enqueue(15);
    }

    @Test
    public void enqueue() throws Exception {
        q.enqueue(100);
        assertEquals(q.getTail(), 100);
    }

    @Test
    public void dequeue() throws Exception {
        q.dequeue();
        assertEquals(q.getHead(), 'b');
    }

    @Test
    public void getTail() throws Exception {
        assertEquals(q.getHead(), 'a');
    }

    @Test
    public void getHead() throws Exception {
        assertEquals(q.getTail(), 15);
    }

}