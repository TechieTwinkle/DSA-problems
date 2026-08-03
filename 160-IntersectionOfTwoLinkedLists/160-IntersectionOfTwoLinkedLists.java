// Last updated: 04/08/2026, 01:37:41
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;
        // int cnt1 = 0;
        // int cnt2 = 0;
        // while(ptr1 != null)
        // {
        //     ptr1 = ptr1.next;
        //     cnt1++;
        // }

        // while(ptr2 != null)
        // {
        //     ptr2 = ptr2.next;
        //     cnt2++;
        // }

        while(ptr1!=ptr2){
            if(ptr1 == null)
            {
                ptr1 = headB;
            }
            else{
                ptr1 = ptr1.next;
            }
            
            if(ptr2 == null)
            {
                ptr2 = headA;
            }
            else{
                ptr2 = ptr2.next;
            }
        }
        return ptr1;
    }
}