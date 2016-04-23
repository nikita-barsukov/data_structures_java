package linked_list;

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
        int init_length = 0;
        Node<T> current = this.head;
        while(current != null){
            current = current.getNextNode();
            init_length ++;
        }
        return init_length;
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
