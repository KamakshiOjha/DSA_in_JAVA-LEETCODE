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
//print list
    public void printList(){
        Node temp = head;
        while(temp!= null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

   
//show data
    public void getHead(){
        System.out.println("head: " + head.value );
        System.out.println("tail: " + tail.value );
        System.out.println("length: " + length );
    }

 //add element in the list   
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
// remove element from end
    public Node remove(){
        if (length== 0) return null;
        Node pre = head;
        Node temp = head;
        while(temp!=null){
            pre=temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0){
            head = null;
            tail= null;
        }
        
        return temp;

    }
//add element at start
    public void prepend(int value){
        Node n = new Node(value);
        if (length == 0){
            n.next = head;
            head = n;
            tail = n;
        }
        n.next = head;
        head = n;
        printList();


    }
//remove element from start of linkedlist

    public void removeFirst(){
        if (length == 0){
            System.out.println("nothing to remove");
        }
        Node temp = null;
        temp = head.next; 
        head.next = null;
        head = temp;
        printList();
    }
// get a element by index
    public void getElement(int index){
        if(index < 0 || index >= length ){
            System.out.println("nothing to remove");
        }
        Node temp = head;
        for(int i = 0; i<index ; i++){
            temp = temp.next;
        }
        System.out.println(temp.value);
        System.out.println(temp);
        printList();

    }
    // or
        public Node get(int index){
        if(index < 0 || index >= length ){
            return null;
        }
        Node temp = head;
        for(int i = 0; i<index ; i++){
            temp = temp.next;
        }
        return temp;

    }

// set a value to a particular index

    public void setElement(int index, int value1){
        if(index < 0 || index >= length ){
            System.out.println("nothing to remove");
        }
        Node temp = head;
        for(int i = 0; i<index ; i++){
            temp = temp.next;
        }
        temp.value = value1;
        printList();

    }

//insert a value at particular index
    public void insertElement(int index,int value){
        if(index < 0 || index > length ){
            System.out.println("cannot insert");
        }
        if(index == 0){
            prepend(value);
            printList();
        }
        if(index == length){
            append(value);
            printList();
        }
        Node newNode = new Node(value);
        Node temp = get(index -1);
        newNode.next = temp.next;
        temp.next = newNode;
        length ++;
        printList();



    }
 
//constructor
    LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length= 1;
    }



}