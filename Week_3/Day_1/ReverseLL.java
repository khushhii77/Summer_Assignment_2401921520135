// Problem: Reverse the linked list and return the new head.
// Approach: Iteratively , here we reverse links using previous and next pointers.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }
}
