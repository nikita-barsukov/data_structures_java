package linked_list;

import java.util.HashSet;
import java.util.Set;

public class LinkedList<T> {
    private Node<T> head;

    public Node<T> getHead(){
        return this.head;
    }

    public void insertAtHead(T data){
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    public void deleteHead() {
        this.head = this.head.getNextNode();
    }

    public Node<T> find(T data) {
        Node<T> current = this.head;
        while(current != null) {
            if(current.getData() == data) {
                return current;
            }
            current = current.getNextNode();
        }
        return null;
    }

    public int length(){
        int lngth = 0;
        Node<T> current = this.head;
        while(current != null){
            current = current.getNextNode();
            lngth ++;
        }
        return lngth;
    }

    public void deleteDuplicates() {
        Set<T> items = new HashSet<T>();
        Node curr = this.getHead();
        Node prev = null;

        while(curr != null) {
            if(items.contains(curr.getData())){
                prev.setNextNode(curr.getNextNode());
            } else{
                items.add((T)curr.getData());
                prev = curr;
            }
            curr = curr.getNextNode();
        }
    }

    public void reverse() {
        Node curr = this.getHead();
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.getNextNode();
            curr.setNextNode(prev);
            prev = curr;
            curr = next;
        }

        this.setHead(prev);
    }

    private void setHead(Node<T> data) {
        this.head = data;
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;

        while(current != null) {
            result += current.toString() + ",";
            current = current.getNextNode();
        }
        result += "}";
        return result;
    }
}
