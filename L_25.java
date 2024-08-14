/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode current = head;
        int count = 0;
        while(current!=null & count<k){
            current = current.next;
            count++;
        }
        if(count == k){
            ListNode pre = null;
            ListNode cur = head;
            ListNode after = null;
            for(int i = 0;i<k;i++){
                after = cur.next;
                cur.next = pre;
                pre = cur;
                cur = after;

            }
            head.next = reverseKGroup(cur,k);
            return pre;
        }
        return head;
    }
}
