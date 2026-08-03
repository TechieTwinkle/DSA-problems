// Last updated: 04/08/2026, 01:38:37
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode temp = head.next;
        ListNode t = new ListNode(head.val);
        ListNode temp2 = t;
        // temp2 = temp2.next;
        // t = t.next;
        while(temp != null){
            if(temp.val != t.val)
            {
                // ListNode m = temp;
                // temp = temp.next;
                // t.next = m;
                // t=m;
                // t= t.next;
                t.next = temp;
                t = temp;
            }
            temp = temp.next;
            // else
            // {
            //     temp = temp.next;
            // }
            
        }
        t.next = null;
       return temp2; 
    }
}