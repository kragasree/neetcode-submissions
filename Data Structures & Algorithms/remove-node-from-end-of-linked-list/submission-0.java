class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int cnt = 0;
        ListNode temp = head;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        int m = cnt - n;
        if (m == 0) {
            return head.next;
        }

        temp = head;
        for (int i = 1; i < m; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return head;
    }
}