// Problem: Detect whether a linked list contains a cycle.
// Approach: we use slow and fast pointers (Floyd Cycle Detection).
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        ListNode prev = head;

        while (temp != null && temp.next != null) {
            prev = prev.next;
            temp = temp.next.next;

            if (prev == temp) return true;
        }

        return false;
    }
}
