// Leetcode - Delete the Middle Node of a Linked List.
public class Delete_the_Middle_Node_of_a_Linked_List {

    public class ListNode {
            int val;
            ListNode next;
           ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    public static void main(String[] args) {
        int []head = {2,1};
        System.out.println(head);
    }
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            temp= temp.next;
        }
        int n = count/2;
        temp = head;
        while(n>0){
            temp= temp.next;
            n--;
        }
        ListNode pre = temp.next;
        temp.next = pre.next;
        pre.next = null;
        return head;

    }

}
