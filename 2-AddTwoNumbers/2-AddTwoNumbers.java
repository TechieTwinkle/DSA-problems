// Last updated: 21/09/2026, 17:54:53
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        int carry = 0;
        while(l1!= null || l2!=null || carry!=0){
            int sum = carry;
            if(l1!=null){
               sum = sum + l1.val;
               l1 = l1.next;
            }
            if(l2!=null){
              sum = sum + l2.val;
              l2 = l2.next;
            }

            temp.val = sum%10;
            carry = sum/10;

            if(l1!=null || l2!=null || carry!=0){
                temp.next = new ListNode();
                temp = temp.next;
            }
        }
        return ans;
    }
}