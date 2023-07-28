public class Stack {
    private Node top;
    private int height;

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height =1;

    }
    public void printStack(){
        Node temp = top;
        while(temp !=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

// push element in stack
    public void push(int value){
        Node newNode = new Node(value);
        if(height == 0){
            top = newNode;
        }
        else{
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

// pop element in stack
    public void pop(){
        if(height==0){
            System.out.println("nothing to pop");
        }
        else{
            Node temp;
            temp = top;
            top = top.next;
            temp.next = null;
        }height--;
    }
}
