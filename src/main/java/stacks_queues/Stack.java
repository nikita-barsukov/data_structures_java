package stacks_queues;

import java.util.LinkedList;

public class Stack<T> {
    private LinkedList llist;

    public Stack(){
        llist = new LinkedList();
    }

    public boolean isEmpty(){
        return this.llist.size() == 0;
    }

    public void push(T item){
        llist.addFirst(item);
    }

    public Object peek() {
        return llist.getFirst();
    }

    public void pop(){
        llist.removeFirst();
    }
}
