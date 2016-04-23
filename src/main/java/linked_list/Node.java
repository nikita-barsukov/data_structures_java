package linked_list;

public class Node<T> {
    private T data;
    private Node nextNode;

    public Node(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }

    public Node<T> getNextNode(){
        return this.nextNode;
    }

    public void setData(T data){
        this.data = data;
    }

    public void setNextNode(Node<T> nextNode){
        this.nextNode = nextNode;
    }

    @Override
    public String toString(){
        return "Data: " + this.data;
    }
}


