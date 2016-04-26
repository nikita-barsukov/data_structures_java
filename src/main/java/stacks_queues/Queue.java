package stacks_queues;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queue<T> {

    private LinkedList llist;

    public Queue(){
        llist = new LinkedList();
    }

    public void enqueue(T item){
        llist.addFirst(item);
    }

    public void dequeue(){
        llist.removeLast();
    }

    public Object getTail() {
        try {
            return llist.getFirst();
        } catch(NoSuchElementException e) {
            return null;
        }
    }
    public Object getHead() {
        try {
            return llist.getLast();
        } catch(NoSuchElementException e) {
            return null;
        }
    }

}
