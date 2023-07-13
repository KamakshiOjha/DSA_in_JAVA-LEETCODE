public class Has_loop {
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
   // Implement a method called hasLoop that checks whether the list contains a loop or not.

   // If the list contains a loop, the method should return true; otherwise, it should return false.
    
    
    public boolean hasLoop(){
	    Node slow = head ;
	    Node fast = head;
	    while(fast != null && fast.next != null){
	        slow = slow.next;
	        fast = fast.next.next;
	        if(fast == slow ){
	            return true;
	        }
	    }return false;
	}
    // getHead function to return head
    public Node getHead(){
        return head;
    }
        //constructor
        Has_loop(int value){
            Node newNode = new Node(value);
            head = newNode;
            tail = newNode;
            length= 1;
        }
}
