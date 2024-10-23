/*

    Following is the Node class already written for the Linked List

    class Node<T> {
        T data;
        Node<T> next;
    
        public Node(T data) {
            this.data = data;
        }
    }

*/

public class Solution {

	public static Node<Integer> reverseRec(Node<Integer> head) {
		if(head == null){
            return head;
        }
        if(head.next == null){
            return head;
        }
        else{
            Node<Integer> temp = reverseRec(head.next);
            head.next.next = head;  
            head.next = null;
            return temp;
        }
	}

}
