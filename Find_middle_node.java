public class Find_middle_node {
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
//Implement a method called findMiddleNode that returns the middle node of the linked list.

//If the list has an even number of nodes, the method should return the second middle node.
    public Node findMiddleNode(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        
        
    }
    //constructor
    Find_middle_node(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length= 1;
    }
    
}
