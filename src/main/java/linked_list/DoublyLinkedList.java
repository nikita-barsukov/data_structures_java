package linked_list;

public class DoublyLinkedList {
    private DoublyLinkedNode head;

    public void insertHead(int data) {
        DoublyLinkedNode newNode = new DoublyLinkedNode(data);
        newNode.setNextNode(this.head);

        if(this.head != null){
            this.head.setPrevNode(newNode);
        }

        this.head = newNode;
    }
}
