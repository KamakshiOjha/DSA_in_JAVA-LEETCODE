/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        // int count = 0;
        // while(fast != null && fast.next != null ){
        //     slow = slow.next;
        //     fast = fast.next;
        //     if(slow == fast){
        //         while(head != slow){
        //             head = head.next;
        //             slow = slow.next;
        //         }
        //         return slow;
        //     }
        // }
        // return null;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                ListNode pre = head;
                while(pre!=slow){
                    pre = pre.next;
                    slow = slow.next;
                }
                return pre;
            }
        }
        return null;
    }
}
