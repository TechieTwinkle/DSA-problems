// Last updated: 04/08/2026, 01:38:40
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
        if (head == null) {
            return null;
        }

        ListNode t = new ListNode(-1);
        ListNode temp2 = t;
        ListNode temp = head;

        while (temp != null) {
            boolean dupp = false;
            while(temp.next !=  null && temp.val == temp.next.val)
            {
                dupp = true;
                temp = temp.next;
            }

            if (!dupp) {
                t.next = temp;
                t = temp;
            }

            temp = temp.next;
        }

        t.next = null;

        return temp2.next;
    }
}