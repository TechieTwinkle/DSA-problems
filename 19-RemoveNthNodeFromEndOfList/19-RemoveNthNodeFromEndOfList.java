// Last updated: 04/08/2026, 01:39:12
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
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null)
        {
            ListNode agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        } 
        return prev;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        head = reverse(head);

        if(n == 1)
        {
            head = head.next;
        }
        else
        {
            ListNode temp = head;

            for(int i = 1; i < n - 1; i++)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;
        }
        head = reverse(head);
        return head;
    }
}