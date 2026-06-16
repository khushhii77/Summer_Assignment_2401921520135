// Problem:  Remove the nth node from the end of the linked list.
// Approach: 1st we count total nodes, then find target position, then delete it.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null || head.next == null) return null;

        ListNode temp = head;
        ListNode cur = head;
        int cnt = 0;

        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        int rem = cnt - n;

        if (rem == 0) return head.next;

        temp = head;

        while (rem > 1) {
            temp = temp.next;
            rem--;
        }

        temp.next = temp.next.next;

        return cur;
    }
}
