//leetcode - problem 876

// class ListNode{
//     int val;
//     ListNode next;
//     ListNode(val){
//         this.val = val;
//     }
// }
public class L_876 {
    public static void main(String[] args) {
        ListNode l = new ListNode(5);
        System.out.println(middleNode(l));
    }
    public static ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        temp = head;
        int mid = length / 2;
        temp = head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }
        return temp;
    }
}
