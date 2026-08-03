// Last updated: 04/08/2026, 01:37:19
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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null)
        {
            ListNode agla = temp.next;
            temp.next = prev;
            prev = temp;
            temp = agla;
        }

        return prev;
    }
}