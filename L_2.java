class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode ans = temp;
        int carry = 0; 

        while (l1 != null || l2 != null) {
            int a = (l1 != null) ? l1.val : 0; 
            int b = (l2 != null) ? l2.val : 0; 
            int t = a + b + carry; 
            carry = t / 10; 
            temp.next = new ListNode(t % 10);

            temp = temp.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            temp.next = new ListNode(carry);
        }

        return ans.next;
    }
}
