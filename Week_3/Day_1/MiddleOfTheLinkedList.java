// Problem: Return the middle node of the linked list.
// Approach: we use slow and fast pointers to reach the middle.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
