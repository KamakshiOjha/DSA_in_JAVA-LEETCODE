//in main_doublyll.java
public class Reverse_DLL {
    private Node head;
    private Node tail;
    private int length;

    public Reverse_DLL(int value){
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
    // add element to last/end
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
    //reverse
    public void reverse() {
        if (length == 0) {
            System.out.println("null");
        } else if (length == 1) {
            printLL();
        }
        if (length >= 2) {
            Node temp = head; 
            while (temp != null) {
                Node var1 = temp.next;
                temp.next = temp.prev;
                temp.prev = var1;
                temp = temp.prev;
            }
            Node temp1 = tail;
            tail = head;
            head = temp1;
        }
    }
    
}
