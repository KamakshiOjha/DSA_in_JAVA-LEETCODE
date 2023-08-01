public class Queue {
    private Node first; 
    private Node last;
    private int length;

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    public Queue(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printQueue(){
        Node temp = first;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    // add element to queue
    public void enqueue(int value){
        Node temp = new Node(value);
        if(length == 0){
            first = temp;
            last = temp;
        }
        else{
            last.next = temp;
            temp.next = null;
            last = temp;
        }
        length ++;
    }
    //remove element from queue
    public void dequeue(){
        if(length == 0){
            first = null;
            last = null;
            length = 0;
        }
        else if(length == 1){
            first = null;
            last = null;
            length = 0;
        }
        else{
            Node temp=first;
            first = first.next;
            temp.next = null;
            length --;
        }

    }
}
