package linked_list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    private LinkedList lnkdlist;
    @Before
    public void setUp() throws Exception {
        lnkdlist = new LinkedList();
        lnkdlist.insertAtHead('a');
        lnkdlist.insertAtHead('b');
        lnkdlist.insertAtHead(5);
        lnkdlist.insertAtHead(5.5);
    }

    @Test
    public void deleteDuplicates() throws Exception {
        LinkedList listWithDuplicates = new LinkedList();
        listWithDuplicates.insertAtHead('a');
        listWithDuplicates.insertAtHead('b');
        listWithDuplicates.insertAtHead(5);
        listWithDuplicates.insertAtHead('a');
        listWithDuplicates.insertAtHead('b');
        listWithDuplicates.insertAtHead(5);

        listWithDuplicates.deleteDuplicates();
        assertEquals(listWithDuplicates.length(), 3);
    }

    @Test
    public void reverse() throws Exception {
        lnkdlist.reverse();
        assertEquals(lnkdlist.getHead().getData(), 'a');
        assertEquals(lnkdlist.length(), 4);
    }

    @Test
    public void getHead() throws Exception {
        assertEquals(lnkdlist.getHead().getData(), 5.5);
    }

    @Test
    public void insertAtHead() throws Exception {
        int varToInsert = 6;
        lnkdlist.insertAtHead(varToInsert);
        assertEquals(lnkdlist.getHead().getData(), varToInsert);
    }

    @Test
    public void deleteHead() throws Exception {
        lnkdlist.deleteHead();
        assertEquals(lnkdlist.getHead().getData(), 5);
    }

    @Test
    public void findExisting() throws Exception {
        assertSame(lnkdlist.find('b').getData(), new Node('b').getData());
    }

    @Test
    public void findNotExisting() throws Exception {
        assertNull(lnkdlist.find("not existing string"));
    }

    @Test
    public void length() throws Exception {
        assertEquals(lnkdlist.length(), 4);
    }

    @Test
    public void isEmpty() throws Exception {
        LinkedList emptyLinkedList = new LinkedList();
        assertTrue(emptyLinkedList.isEmpty());
    }
}
