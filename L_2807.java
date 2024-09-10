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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode pre = head;
        ListNode temp = head.next;
        while(temp!=null){
            int gcd = divisor(pre.val, temp.val);
            ListNode res = new ListNode(gcd);
            pre.next = res;
            res.next = temp;
            pre = pre.next.next;
            temp = temp.next;
        }
        return head;
    }
    public static int divisor(int a,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
