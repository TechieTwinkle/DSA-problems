// Last updated: 04/08/2026, 01:39:04
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // setting the temp to list
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        // node created for new new list
        ListNode head = new ListNode(-1);
        ListNode temp = head;

        while(temp1!=null && temp2!=null)
        { // traversal through lists
            if(temp1.val < temp2.val) // checking for temp1
            {
                ListNode a = new ListNode(temp1.val);
                temp.next = a;
                temp = a;
                
                temp1 = temp1.next;

            }else{
                ListNode b = new ListNode(temp2.val);
                temp.next = b;
                temp = b;
                
                temp2 = temp2.next;
            }
        }
        if(temp1 == null) temp.next = temp2;
        else temp.next = temp1;
        
        return head.next;
    }
}