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
        ListNode head = null;
        ListNode ans = null;

        if(list1 == null) return list2;
        if(list2 == null) return list1;

        while (list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                if(ans == null) {
                    ans = list1;
                    head = ans;        // capture head at first node
                } else {
                    ans.next = list1;  // attach to tail
                    ans = ans.next; 
                }
                list1 = list1.next;
            } else {
                if(ans == null) {
                    ans = list2;
                    head = ans;        // capture head at first node
                } else {
                    ans.next = list2;  // attach to tail
                    ans = ans.next; 
                }
                list2 = list2.next;
            }
        }

        if(list1 != null) {
            ans.next = list1;
        }
        
        if(list2 != null) {
            ans.next = list2;
        }

        return head; 
    }
}