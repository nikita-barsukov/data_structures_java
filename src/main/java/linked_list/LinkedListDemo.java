package linked_list;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(12);
        list.insertAtHead(11);

        list.deleteHead();

        System.out.println(list.find(10));
        System.out.println(list.find(100));

        System.out.println(list);
        System.out.println("Length: " + list.length());
    }
}
