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

    // remove element from last
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
        if(length == 0){
            System.out.println("last element was removed");
        }

    }

//add element to start
    public void prepend(int value){
        Node temp = new Node(value);
        if(length == 0){
            head = temp;
            tail = temp;
            length = 1;
        }else{
            temp.next = head;
            head.prev = temp;
            head = temp;
            length++;
        }

    }

//remove element from start
    public void removeFirst(){
        if(length == 0){
            System.out.println("nothing to remove");
        }
        if(length == 1){
            head = null;
            tail=null;
        }
        else{
            Node temp = head;
            head = head.next;
            temp.next = null;
            head.prev = null;
            length--;
        }
    }
    
}
