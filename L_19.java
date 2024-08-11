class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = head;
        ListNode after = head;
        
        for (int i = 0; i < n; i++) {
            if (after == null) {
                return head;
            }
            after = after.next;
        }
        
        if (after == null) {
            return head.next;
        }
        while (after.next != null) {
            pre = pre.next;
            after = after.next;
        }
        pre.next = pre.next.next;
        
        return head;
        
    }
}
