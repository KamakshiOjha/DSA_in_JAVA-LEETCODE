 class LinkedList{
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    public void printList(){
        Node temp = head;
        while(temp!= null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

   

    public void getHead(){
        System.out.println("head: " + head.value );
        System.out.println("tail: " + tail.value );
        System.out.println("length: " + length );
    }
    public void append(int value){
        Node n = new Node(value);
        if(length == 0){
            head = n;
            tail = n;
        }
        else{
            tail.next = n;
            tail = n;

        }
        length++;
    }


    LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length= 1;
    }



}