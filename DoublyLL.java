public class DoublyLL {
    private Node head;
    private Node tail;
    private int length;

    public DoublyLL(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;


    }
    class Node {
        int value;
        Node next;
        Node prev;
        Node(int value){
        this.value = value;
    }
    }

    public void printLL(){
        Node temp =head;
        while(temp !=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value){
        Node n = new Node(value);
        if(length == 0){
            head = n;
            tail = n;
        }
        else{
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
        length ++;

    }
    public void remove(){
        if(length == 0){
            System.out.println("nothing to remove");
        }
        Node temp = tail;
        tail= tail.prev;
        tail.next = null;
        temp.prev = null;
        System.out.println(temp.value); 
        length--;

    }
    
}
