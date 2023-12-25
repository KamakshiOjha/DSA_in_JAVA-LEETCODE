// leetcode - 141. Linked List Cycle
class ListNode {
     int val;
     ListNode next;
   ListNode(int x) {
          val = x;
         next = null;
    }
 }

 class Linkedlist{
    private ListNode head;
    private ListNode tail;
    private int length;

    Linkedlist(int value){
        ListNode val = new ListNode(value);
        head = val;
        tail = val;
        length = 1;
    }

 }
public class Linked_List_Cycle {
    public static void main(String[] args) {
        // Linkedlist l = new Linkedlist(1);
        // l.append(3);
        
    }
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    // public static void append(int value){
    //     ListNode newval = new ListNode(value);
    //     head.next = value;
    // }
}
