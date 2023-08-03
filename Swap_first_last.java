public class Swap_first_last {
    private Node head;
    private Node tail;
    private int length;

    public Swap_first_last(int value){
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
    public void swapFirstLast(){
        if(length>2){
            Node first = head;
            Node last = tail;
            head = last;
            tail = first;

        }else{
            System.out.println("nothing to swap");
        }
        printLL();
    }

}
