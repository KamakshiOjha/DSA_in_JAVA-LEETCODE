//leetcode - Remove Duplicates from Sorted List II.
public class Remove_Duplicates_from_Sorted_List_II {
    public class ListNode {
        int val;
        ListNode next;
       ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
public static void main(String[] args) {
    
    Remove_Duplicates_from_Sorted_List_II result = new Remove_Duplicates_from_Sorted_List_II();

    ListNode head = result.new ListNode(1);
    head.next = result.new ListNode(2);
    head.next.next = result.new ListNode(2);
    head.next.next.next = result.new ListNode(3);
    head.next.next.next.next = result.new ListNode(4);

    ListNode finalR = result.deleteDuplicates(head);

    while(finalR != null){
        System.out.println(finalR.val);
        finalR = finalR.next;
    }
    }


    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;

        while(temp.next != null && temp.next.next != null){
            if(temp.next.val == temp.next.next.val){
                int d = temp.next.val;
                while(temp.next != null && temp.next.val == d){
                    temp.next = temp.next.next;
                }

            }else{
                temp = temp.next;
            }
        } 
    return dummy.next;
}
}
